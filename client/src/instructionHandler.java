//该类从服务器程序解码指令字符串,然后将字符串转换为真正的指令
//2013747张怡桢
//由客户端程序可读
public class instructionHandler{
	public static void handleInstruction(ClientModel gameModel, String instruction){
		if(instruction.length() == 0)
			return;

		int i = 0;
		while(i < instruction.length()){
			String perInstruction = "";

			//指令由”;“开头在instruction-string分离
			while(!instruction.substring(i, i+1).equals(";")){
				perInstruction+=instruction.substring(i, i+1);
				i++;
			}

			//指令“L”开头是负载水平,其次是“L”数量水平指数
			if(perInstruction.substring(0,1).equals("L")){
				level.loadLevel(gameModel, Integer.parseInt(perInstruction.substring(1,2)));
				return;
			}

			//指令“w”开头意味着一些事情改变了在墙上的对象
			if(perInstruction.substring(0,1).equals("w")){
				int xPos = 0; int yPos = 0; boolean[] shape = new boolean[16];
				String temp = "";
				int j = 1;
				//得到x的位置
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y的位置
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				yPos = Integer.parseInt(temp);

				//墙的详细的边界
				for(int k = 0; k < 16; k++){
					if(perInstruction. substring(j, j+1).equals("1"))
						shape[k] = true;
					else
						shape[k] = false;
					j++;
				}

				//执行指令
				for(int k = 0; k < gameModel.drawingList.length; k++){
					if(gameModel.drawingList[k] != null){
						if(gameModel.drawingList[k].getxPos() == xPos && gameModel.drawingList[k].getyPos() == yPos){
							wall tempWall = new wall(xPos, yPos, 4, gameModel);
							tempWall.shape = shape;
							gameModel.drawingList[k] = tempWall;
						}
					}
				}
			}

			//指令“s”开头意味着一些事情改变了一个铁墙对象
			if(perInstruction.substring(0,1).equals("s")){
				int xPos = 0; int yPos = 0; boolean[] shape = new boolean[4];
				String temp = "";
				int j = 1;
				//得到x的位置
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y的位置
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				yPos = Integer.parseInt(temp);

				//详细的钢墙边境
				for(int k = 0; k < 4; k++){
					if(perInstruction. substring(j, j+1).equals("1"))
						shape[k] = true;
					else
						shape[k] = false;
					j++;
				}

				//执行指令
				for(int k = 0; k < gameModel.drawingList.length; k++){
					if(gameModel.drawingList[k] != null){
						if(gameModel.drawingList[k].getxPos() == xPos && gameModel.drawingList[k].getyPos() == yPos){
							Steelwall tempWall = new Steelwall(xPos, yPos, 4, gameModel);
							tempWall.shape = shape;
							gameModel.drawingList[k] = tempWall;
						}
					}
				}
			}

			//指令“b”开头意味着基地已被摧毁
			if(perInstruction.substring(0,1).equals("b")){
				gameModel.drawingList[4] = new normalObject(260, 498,  gameModel, "base", 1);
			}

			//指令“n”开头显示正常的对象,如丧尸、启动符号
			if(perInstruction.substring(0,1).equals("n")){
				int xPos = 0; int yPos = 0; int textureIndex = -1;
				String temp = "";
				int j = 1;
				//得到x对象的位置
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y对象的位置
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				yPos = Integer.parseInt(temp);

				//获得对象的纹理指数
				temp = "";
				while(j < perInstruction.length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				textureIndex = Integer.parseInt(temp);

				//执行指令
				gameModel.addActor(new normalObject(xPos, yPos, gameModel, "normal", textureIndex));
			}


			//指令“t”开头表明子弹
			if(perInstruction.substring(0,1).equals("t")){
				int xPos = 0; int yPos = 0; int direction = -1;
				String temp = "";
				int j = 1;
				//得到x子弹的位置
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y子弹的位置
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				yPos = Integer.parseInt(temp);

				//子弹的方向
				temp = "";
				while(j < perInstruction.length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				direction = Integer.parseInt(temp);

				//执行指令
				gameModel.addActor(new bullet(xPos, yPos, gameModel, direction));
			}

			//指令“o”开头表示一个炸弹
			if(perInstruction.substring(0,1).equals("o")){
				int xPos = 0; int yPos = 0; int size = -1;
				String temp = "";
				int j = 1;
				//得到x炸弹的位置
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y炸弹的位置
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				yPos = Integer.parseInt(temp);

				//炸弹的大小
				temp = "";
				while(j < perInstruction.length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				if(temp.equals("small"))
					size = 1;
				else
					size = 0;
				//执行指令
				gameModel.addActor(new bomb(xPos, yPos, size, gameModel));
			}

			//指令“i”开头表明丧尸盾牌
			if(perInstruction.substring(0,1).equals("i")){
				int xPos = 0; int yPos = 0;
				String temp = "";
				int j = 1;
				//得到x位置的盾牌
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y位置的盾牌
				temp = "";
				while(j < perInstruction. length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				yPos = Integer.parseInt(temp);

				//执行指令
				gameModel.addActor(new shield(xPos, yPos, gameModel));
			}

			//指令“p”开头表示水平和玩家信息
			if(perInstruction.substring(0,1).equals("p")){
				String temp = "";
				int j = 1;
				//得到敌人离开的数量
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.EnemyLeft =  Integer.parseInt(temp);

				//得到水平指数
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.LevelIndex =  Integer.parseInt(temp);

				//玩家1的生命量
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.P1Life =  Integer.parseInt(temp);

				//玩家1的分数
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.P1Score =  Integer.parseInt(temp);

				//玩家2的生命量
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.P2Life =  Integer.parseInt(temp);

				//玩家2的分数
				temp = "";
				while(j < perInstruction.length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.P2Score =  Integer.parseInt(temp);
			}

			//指令“g”开头表明获取胜利的统计数量
			if(perInstruction.substring(0,1).equals("g")){
				String temp = "";
				int j = 1;
				//得到敌人离开的数量
				while(j < perInstruction.length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				level.winningCount = Integer.parseInt(temp);
			}

			//指令“m”开头表示服务器玩家的信息
			if(perInstruction.substring(0,1).equals("m")){
				gameModel.addMessage("主机端玩家说：" + perInstruction.substring(1,perInstruction.length()));
			}

			//指令“a”开头表示游戏结束
			if(perInstruction.substring(0,1).equals("a")){
				if(!gameModel.gameOver){
					gameModel.addMessage("GAME OVER ! 　想再玩一次吗 ( y / n ) ?");
					gameModel.gameOver = true;
				}
			}
			//指令“j”开头表示服务器玩家想在玩一次
			if(perInstruction.substring(0,1).equals("j")){
				if(gameModel.gameOver)
					gameModel.serverVoteYes = true;
			}

			//指令“x”开头表示服务器玩家暂停游戏
			if(perInstruction.substring(0,1).equals("x")){
				int temp = Integer.parseInt(perInstruction.substring(1,2));
				if(temp == 0){
					if(gameModel.gamePaused){
						gameModel.addMessage("主机端玩家取消了暂停");
						gameModel.gamePaused = false;
					}
				}else{
					if(!gameModel.gamePaused){
						gameModel.addMessage("主机端玩家暂停了游戏");
						gameModel.gamePaused = true;
					}
				}
			}
			i++;
		}
	}
}