//这个类从客户端程序解码指令字符串,然后将字符串转换为真正的指令
//服务器程序可读
//2013747张怡桢
public class feedbackHandler{
	public static void handleInstruction(ServerModel gameModel, String instruction){
		if(instruction.length() == 0)
			return;

		int i = 0;
		while(i < instruction.length()){
			String perInstruction = "";

			//指令是“；”时
			while(!instruction.substring(i, i+1).equals(";")){
				perInstruction+=instruction.substring(i, i+1);
				i++;
			}

			//指令是“m”表明客户端运动信息
			if(perInstruction.substring(0,1).equals("m")){
				gameModel.P2.moveUp = false;
				gameModel.P2.moveDown = false;
				gameModel.P2.moveLeft = false;
				gameModel.P2.moveRight = false;
				gameModel.P2.fire = false;

				String temp = perInstruction.substring(1,2);
				if(temp.equals("1"))
					gameModel.P2.moveUp = true;
				temp = perInstruction.substring(2,3);
				if(temp.equals("1"))
					gameModel.P2.moveDown = true;
				temp = perInstruction.substring(3,4);
				if(temp.equals("1"))
					gameModel.P2.moveLeft = true;
				temp = perInstruction.substring(4,5);
				if(temp.equals("1"))
					gameModel.P2.moveRight = true;
				temp = perInstruction.substring(5,6);
				if(temp.equals("1"))
					gameModel.P2.fire = true;
			}

			//指令是“e”表示服务器玩家信息
			if(perInstruction.substring(0,1).equals("e")){
				gameModel.addMessage("用户端玩家说：" + perInstruction.substring(1,perInstruction.length()));
			}

			//指令是“j”表示客户端玩家想在玩一次
			if(perInstruction.substring(0,1).equals("j")){
				if(gameModel.gameOver)
					gameModel.clientVoteYes = true;
			}

			//指令是“x”表示服务器玩家暂停游戏
			if(perInstruction.substring(0,1).equals("x")){
				if(gameModel.gamePaused){
					gameModel.addMessage("用户端玩家取消了暂停");
					gameModel.gamePaused = false;
				} else if(!gameModel.gamePaused){
					gameModel.addMessage("用户端玩家暂停了游戏");
					gameModel.gamePaused = true;
				}
			}
			i++;
		}
	}

}