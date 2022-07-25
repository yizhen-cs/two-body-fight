import java.net.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
//2013747张怡桢
public class ServerModel implements ActionListener{
	//视图参考
	public ServerView view;

	//连接变量
	public ServerSocket serverSocket;
	public Socket clientSocket;
	public PrintWriter out;
	public BufferedReader in;
	public String inputLine, outputLine;

	//服务器状态
	public boolean serverCreated;
	public boolean clientConnected;
	public boolean gameStarted;
	public boolean gamePaused;
	public boolean gameOver;
	public boolean serverVoteYes, serverVoteNo;
	public boolean clientVoteYes, clientVoteNo;
	public boolean pausePressed;

	//游戏消息
	public String[] messageQueue;
	public int messageIndex;
	public String playerTypedMessage = "";

	//实际的游戏在这个线程上运行，而主线程监听用户的输入
	public Ticker t;

	public Image[] textures;

	//游戏变量
	public static int gameFlow;
	public Actor[] actors;
	public player P1;   //由服务器玩家控制的丧尸
	public player P2;   //有客户端玩家控制的丧尸

	public ServerModel(ServerView thisview){

		view = thisview;
		messageQueue = new String[8];
		view.mainPanel.messageQueue = messageQueue;

		addMessage("欢迎来到守护宝藏之射击游戏主机端!  请点击\"建立主机\"按钮开始游戏" );

		t = new Ticker(1000);
		t.addActionListener(this);

	}


	public void createServer(){

 		addMessage("正在建立主机(端口9999,IP：127.0.0.1)");

 		try {
			serverSocket = new ServerSocket(9999);
        	serverCreated = true;
        } catch (Exception e) {
			addMessage("无法建立主机，请确认端口9999没有被别的程序使用");
			System.out.println(e);
			t.stop();
			return;
        }

		addMessage("建立完成，等待玩家连接");

        try {
		   clientSocket = serverSocket.accept();
	       clientConnected = true;

	    	out = new PrintWriter(clientSocket.getOutputStream(), true);
		    in = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream()));

	    } catch (Exception e) {
			addMessage("连接中出现错误，请重新建立主机");
			serverCreated = false;
			clientConnected = false;
			t.stop();

			//当发生错误，摧毁一切已创建的
			try{
				serverSocket.close();
				clientSocket.close();
				out.close();
				in.close();
			}catch(Exception ex){}

			return;
        }

		view.messageField.setEnabled(true);
		addMessage("玩家已连接上，开始载入游戏");

		//一旦客户端连接，然后告诉客户端开始加载游戏
		 out.println("L1;");

		//加载游戏
		textures = new Image[88];
		for(int i = 1; i < textures.length+1; i++)
			textures[i-1] = Toolkit.getDefaultToolkit().getImage("image/" + i + ".jpg");


		//设置第一关
		actors = new Actor[400];
		level.loadLevel(this);

		P1 = new player("1P", this);
		addActor(P1);
		P2 = new player("2P", this);
		addActor(P2);



		gameStarted = true;
		view.mainPanel.actors = actors;
		view.mainPanel.gameStarted = true;

	addMessage("载入完毕，游戏开始了！");
	}

	public void actionPerformed(ActionEvent e){
		createServer();

		//如果程序未能创建服务器，则什么也不做
		if(!serverCreated)
			return;

		//游戏逻辑回路，
		try{
			while((inputLine = in.readLine()) != null){
				//处理客户反馈消息
				feedbackHandler.handleInstruction(this, inputLine);

				outputLine = "";

				if(!gamePaused)
					gameFlow++;

				if(pausePressed){
					if(!gamePaused){
						outputLine+= "x0;";
					}else{
						outputLine+= "x1;";
					}
					pausePressed = false;
				}

				if(gameOver || (P1.life == 0 && P2.life == 0)){
					if(P1.freezed != 1)
						outputLine+="a;";


					if((P1.freezed != 1 || messageIndex == 1) && serverVoteYes){
						addMessage("等待用户端玩家的回应...");
					}
					if(P1.freezed != 1 || messageIndex == 0){
							addMessage("GAME OVER ! 　想再玩一次吗 ( y / n ) ?");
					}
					gameOver =  true;
					P1.freezed = 1;
					P2.freezed = 1;

					if(serverVoteNo && !serverVoteYes)
						System.exit(0);

					if(serverVoteYes){
						outputLine+="j;";
						if(clientVoteYes){
							addMessage("用户端玩家决定再玩一次，游戏重新开始了...");

							//重新启动游戏
							P1 = new player("1P", this);
							P2 = new player("2P", this);
							level.reset();
							level.loadLevel(this);
							gameOver = false;
							serverVoteYes = false;
							clientVoteYes = false;
							serverVoteNo = false;
							enemy.freezedMoment = 0;
							enemy.freezedTime = 0;
							gameFlow = 0;

							//告诉客户端程序重新启动游戏
							outputLine+="L1;";
						}
					}
				}

				if(level.deathCount == 20 &&  !gameOver){
					level.winningCount++;
					if(level.winningCount == 120){
						P1.freezed = 1;
						P2.freezed = 1;
					}
					if(level.winningCount == 470){
						if(P1.life > 0)
							P1.reset();
						if(P2.life > 0)
							P2.reset();
						level.loadLevel(this);
						//告诉客户端程序加载下一关
						outputLine+="L" +(1 +  (level.currentLevel-1)%8) + ";";
					}
					if(level.winningCount  == 500){
						P1.freezed = 0;
						P2.freezed = 0;
						level.deathCount = 0;
						level.winningCount = 0;
					}

				}

				//大量生产敌人丧尸
				if(!gamePaused)
					level.spawnEnemy(this);

				for(int i = 0; i < actors.length; i++){
					if(actors[i] != null)
						actors[i].move();
				}

				//从消息队列中删除一个消息每10秒，（如果有的话）
				if(gameFlow%300 == 0)
					removeMessage();

				//将玩家、关卡的信息写入输出行
				outputLine+="p" + level.enemyLeft + "," + level.currentLevel + "," + P1.life + "," + P1.scores + "," +  P2.life + "," + P2.scores +";";
				outputLine+="g" + level.winningCount + ";";

				//将玩家类型信息写入输出行
				if(!playerTypedMessage.equals("")){
					outputLine+=playerTypedMessage;
					playerTypedMessage = "";
				}

				//将最后的指令字符串发送到客户端程序
				out.println(outputLine);

				//调用视图重绘本身
				view.mainPanel.repaint();

				//如果玩家切换到对话框模式，则停止所有丧尸动作
				if(!view.mainPanel.hasFocus()){
					P1.moveLeft = false;
					P1.moveUp = false;
					P1.moveDown = false;
					P1.moveRight = false;
					P1.fire = false;
				}

				Thread.sleep(30);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			view.messageField.setEnabled(false);
			serverVoteYes= false;
			serverVoteNo = false;
			clientVoteYes = false;
			serverCreated = false;
			gameStarted = false;
			gameOver = false;
			gameFlow = 0;
			enemy.freezedTime = 0;
			enemy.freezedMoment = 0;
			view.mainPanel.gameStarted = false;
			t.stop();
			addMessage("玩家退出了，请重新建立主机");

			//当发生错误在游戏中，摧毁任何东西，包括游戏的变量
			try{
				out.close();
				in.close();
				clientSocket.close();
        		serverSocket.close();
			}catch(Exception exc){}

			//破坏游戏数据
			P1 = null;
			P2 = null;
			level.reset();
		}
	}

	//添加游戏对象（如丧尸，子弹等..）到游戏系统
	public void addActor(Actor actor){
		for(int i = 0; i < actors.length; i ++ )
			if(actors[i] == null){
				actors[i] = actor;
				break;
			}
	}

	//从游戏系统中移除游戏对象
	public void removeActor(Actor actor){
			for(int i = 0; i < actors.length; i ++ )
					if(actors[i] == actor){
						actors[i] = null;
						break;
			}
	}


	//在屏幕上显示一行消息
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

		//调用视图重绘屏幕如果游戏有没有开始
		if(!gameStarted)
			view.mainPanel.repaint();
	}

	//删除屏幕上最早的信息
	public void removeMessage(){
		if(messageIndex == 0)
			return;

		messageIndex--;
		for(int  i = 0; i < messageIndex; i++)
			messageQueue[i] = messageQueue[i+1];
		messageQueue[messageIndex] = null;

		//调用视图重绘屏幕如果比赛还没开始
		if(!gameStarted)
			view.mainPanel.repaint();
	}

}