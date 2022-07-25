import java.net.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
//2013747张怡桢
public class ClientModel implements ActionListener{
	public ClientView view;

	//连接变量
	public Socket clientSocket;
	public PrintWriter out;
	public BufferedReader in;
	public String fromServer,  fromUser;
	public String serverIP;

	//客户端状态
	public boolean serverConnected;
	public boolean gameStarted;
	public boolean gamePaused;
	public boolean gameOver;
	public boolean serverVoteYes, serverVoteNo;
	public boolean clientVoteYes, clientVoteNo;
	public boolean pausePressed;

	//图像信息
	public String[] messageQueue;
	public int messageIndex;
	public String playerTypedMessage = "";


	//textures
	public Image[] textures;

	//实际的游戏运行在这个线程,而主线程听用户的输入
	public Ticker t;

	//游戏变量
	public static int gameFlow;
	public Actor[] drawingList;
	public boolean moveUp;
	public boolean moveDown;
	public boolean moveLeft;
	public boolean moveRight;
	public boolean fire;


	public ClientModel(ClientView thisview){
		view = thisview;
		messageQueue = new String[8];
		view.mainPanel.messageQueue = messageQueue;
		addMessage("欢迎来到守护宝藏之射击游戏！请输入主机IP地址然后点击\"连接主机\"按钮开始游戏");

		t = new Ticker(1000);
		t.addActionListener(this);

	}

	public void connectServer(){
		addMessage("正在连接主机");

		try{
		 	serverIP = view.IPfield.getText();
		 	InetAddress addr = InetAddress.getByName(serverIP);
			clientSocket = new Socket(addr, 9999);

			out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		}catch(Exception e){
			t.stop();
			System.out.println(e);
			addMessage("连接中出现错误， 请确认 1. 输入的IP是否正确,   2. 主机端已存在");
			return;
		}

		serverConnected = true;
		addMessage("已成功连接到主机，开始载入游戏");
		view.IPfield.setFocusable(false);
		view.IPfield.setEnabled(false);

		//加载游戏 texture
		textures = new Image[88];
		for(int i = 1; i < textures.length+1; i++)
			textures[i-1] = Toolkit.getDefaultToolkit().getImage("image/" + i + ".jpg");


		drawingList = new Actor[400];

		gameStarted = true;
		view.mainPanel.gameStarted = gameStarted;;
		view.mainPanel.drawingList = drawingList;
		view.messageField.setEnabled(true);
		addMessage("载入完毕，游戏开始了！");
	}

	public void actionPerformed(ActionEvent e){
		connectServer();

		//如果程序不能连接到服务器然后什么都不做
		if(!serverConnected)
				return;

		//游戏逻辑循环,客户端程序实际不执行任何逻辑计算,它只接受drawing-instructions
		try{
			while ((fromServer = in.readLine()) != null) {
                fromUser = "";

                gameFlow++;

				if(pausePressed){
					fromUser+= "x;";
					pausePressed = false;
				}

				if(gameOver){
					if(clientVoteNo)
						System.exit(0);

					if(clientVoteYes){
						fromUser+="j;";
						if(serverVoteYes){
							addMessage("主机端玩家决定再玩一次，游戏重新开始了...");
							gameOver = false;
							clientVoteYes = false;
							serverVoteYes = false;
						}
					}
				}

				//指令字符串做出反馈,告诉服务器客户端在做什么
				fromUser +="m";
				if(moveUp)
					fromUser+= "1";
				else
					fromUser+= "0";
				if(moveDown)
					fromUser+="1";
				else
					fromUser+= "0";
				if(moveLeft)
					fromUser+="1";
				else
					fromUser+= "0";
				if(moveRight)
					fromUser+="1";
				else
					fromUser+= "0";
				if(fire)
					fromUser+="1";
				else
					fromUser+= "0";
				fromUser+=";";

				//来自服务器的进程指令
				instructionHandler.handleInstruction(this, fromServer);

				//从消息队列中删除一个消息每10秒,(如果有)
				if(gameFlow%300 == 0)
					removeMessage();

				//输出玩家丧尸信息
				if(!playerTypedMessage.equals("")){
					fromUser+=playerTypedMessage;
					playerTypedMessage = "";
				}

				//发送反馈指令
				out.println(fromUser);

				//调用视图重新绘制它自己
				view.mainPanel.repaint();

				//如果切换到对话模式的玩家,那么停止所有丧尸行动
				if(!view.mainPanel.hasFocus()){
					moveLeft = false;
					moveUp = false;
					moveDown = false;
					moveRight = false;
					fire = false;
				}
        	}
		}catch(Exception ex){
			ex.printStackTrace();
			t.stop();
			view.messageField.setEnabled(false);
			serverConnected = false;
			gameStarted = false;
			view.mainPanel.gameStarted = false;
			gameOver = false;
			addMessage("主机端退出了");
			view.IPfield.setFocusable(true);
			view.IPfield.setEnabled(true);

			//当有错误发生时,关闭创建的任何事情
			try{
				out.close();
				in.close();
				clientSocket.close();
			}catch(Exception exc){
				System.out.println(exc);
			}
		}
	}

	//在屏幕上显示一条消息
	public void addMessage(String message){
		if(messageIndex < 8){
			messageQueue[messageIndex] = message;
			messageIndex++;
		}
		else{
			for(int  i = 0; i < 7; i++)
				messageQueue[i] = messageQueue[i+1];
			messageQueue[7] = message;
		}

		//调用视图来重新绘制屏幕，如果没有开始游戏
		if(!gameStarted)
			view.mainPanel.repaint();
	}

	//删除最早的消息在屏幕上
	public void removeMessage(){
		if(messageIndex == 0)
			return;

		messageIndex--;
		for(int  i = 0; i < messageIndex; i++)
			messageQueue[i] = messageQueue[i+1];
		messageQueue[messageIndex] = null;

		//调用视图来重新绘制屏幕如果没有开始游戏
		if(!gameStarted)
			view.mainPanel.repaint();
	}

	//添加一个游戏对象(如丧尸、子弹等)图纸清单
	public void addActor(Actor actor){
		for(int i = 0; i < drawingList.length; i ++ )
			if(drawingList[i] == null){
				drawingList[i] = actor;
				break;
			}
	}

	//删除一个游戏对象从图纸清单
	public void removeActor(Actor actor){
			for(int i = 0; i < drawingList.length; i ++ )
					if(drawingList[i] == actor){
						drawingList[i] = null;
						break;
			}
	}


}
