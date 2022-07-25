import javax.swing.*;
import java.awt.event.*;
//2013747张怡桢
//这个类处理来自服务器视图的输入
public class ServerControler{
	public ServerView view;
	public ServerModel model;
	public int helpMessageCount = 1;

	//一个玩家丧尸的参考

	public ServerControler(ServerView thisview,  ServerModel thismodel){
		view = thisview;
		model = thismodel;

		//操作发送消息按钮的动作
		view.sendMessage.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					if(!model.gameStarted){
						model.addMessage("还没有和别的玩家联上, 无法发送对话");
						return;
					}

					if(!view.messageField.getText().equals("")){
						model.addMessage("主机端玩家说：" + view.messageField.getText());
						model.playerTypedMessage += "m" + view.messageField.getText() + ";";
						view.messageField.setText("");
					}else{
						model.addMessage("对话内容不能为空");
					}
				}
			}
		);

		//操作建立主机按钮的动作
		view.createServer.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					if(!model.serverCreated)
						model.t.start();
				}
			}
		);

		//操作暂停/继续按钮的动作
		view.pauseAndResume.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					model.pausePressed = true;;
					if(!model.gameOver && model.gameStarted){
						if(!model.gamePaused){
							model.gamePaused = true;
							model.addMessage("主机端玩家暂停了游戏");
						}else{
							model.gamePaused = false;
							model.addMessage("主机端玩家取消了暂停");
						}
					}
				}
			}
		);

		//操作帮助按钮的动作
		view.help.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					model.addMessage("****************************守护宝藏之射击游戏****************************");
					model.addMessage("帮助: 按s键发射子弹,按键盘的方向键来控制守护战士的移动");
					model.addMessage("如果按键没有反应请 1. 关闭大写功能; 2. 用 tab键切换 ");
					model.addMessage("如果您在使用对话界面请移动到控制界面.");
					model.addMessage("********************************************************************************");
				}
			}
		);

		//操作退出按钮的动作
		view.exit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			}
		);

		//操作输入按钮的动作
		view.messageField.addKeyListener( new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if(helpMessageCount  > 0){
					model.addMessage("提示：用\"tab\"键可以自由切换于控制界面和对话界面");
					model.addMessage("提示：按回车键可以直接发送您的对话");
					helpMessageCount--;
				}

				if(e.getKeyCode()==e.VK_ENTER){
					if(!view.messageField.getText().equals("")){
						model.addMessage("主机端玩家说：" + view.messageField.getText());
						model.playerTypedMessage += "m" + view.messageField.getText() + ";";
						view.messageField.setText("");
					}else{
						model.addMessage("对话内容不能为空");
					}
				}
			}
		});

		JPanel temp = view.mainPanel;
		temp.addKeyListener( new KeyAdapter(){
				public void keyPressed(KeyEvent e){
					if(model.P1 != null){
						if(e.getKeyCode() == KeyEvent.VK_UP){
							model.P1.moveUp = true;
							model.P1.moveDown = false;
							model.P1.moveLeft = false;
							model.P1.moveRight = false;
						}
						if(e.getKeyCode() == KeyEvent.VK_DOWN ){
							model.P1.moveDown = true;
							model.P1.moveUp = false;
							model.P1.moveLeft = false;
							model.P1.moveRight = false;
						}
						if(e.getKeyCode() == KeyEvent.VK_LEFT ){
							model.P1.moveLeft = true;
							model.P1.moveUp = false;
							model.P1.moveDown = false;
							model.P1.moveRight = false;
						}
						if(e.getKeyCode() == KeyEvent.VK_RIGHT ){
							model.P1.moveLeft = false;
							model.P1.moveUp = false;
							model.P1.moveDown = false;
							model.P1.moveRight = true;
						}
						if(e.getKeyChar() == 's')
							model.P1.fire = true;

						if(e.getKeyCode()==e.VK_ENTER){
							if(!view.messageField.getText().equals("")){
								model.addMessage("主机端玩家说：" + view.messageField.getText());
								model.playerTypedMessage += "m" + view.messageField.getText() + ";";
								view.messageField.setText("");
							}
						}

						if(e.getKeyChar() == 'y' && model.gameOver && !model.serverVoteYes){
							model.serverVoteYes = true;
							model.addMessage("等待用户端玩家的回应...");
						}

						if(e.getKeyChar() == 'n'  && model.gameOver)
							model.serverVoteNo = true;
					}
				}

				public void keyReleased(KeyEvent e){
						if(model.P1 != null){
							if(e.getKeyCode() == KeyEvent.VK_UP)
								model.P1.moveUp = false;
							if(e.getKeyCode() == KeyEvent.VK_DOWN )
								model.P1.moveDown = false;
							if(e.getKeyCode() == KeyEvent.VK_LEFT )
								model.P1.moveLeft = false;
							if(e.getKeyCode() == KeyEvent.VK_RIGHT )
								model.P1.moveRight = false;
							if(e.getKeyChar() == 's')
								model.P1.fire = false;
					}
				}
			}
		);

	}
}