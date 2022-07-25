import java.awt.*;
//2013747张怡桢
public class player implements Actor{
	public final int UP = 0;
	public final int DOWN = 1;
	public final int LEFT = 2;
	public final int RIGHT = 3;
	public final int size = 12;
	public final Rectangle map = new Rectangle(35, 35, 452, 452);
	public int scores;
	public String type;
	public int life;
	public int speed;
	public int direction;
	public int InvulnerableTime;
	public int freezed;
	public int freezedTime;
	public boolean moveUp;
	public boolean moveDown;
	public boolean moveLeft;
	public boolean moveRight;
	public boolean fire;
	public int numberOfBullet;
	public int coolDownTime;
	public int status;
	public int health;
	public int xPos, yPos, xVPos, yVPos;
	public Rectangle border;
	public Image standardImage;
	public Image[] textures;
	public ServerModel gameModel;

	public player(String type, ServerModel gameModel){
		this.type = type;
		life = 3;
		direction = UP;
		status = 1;
		health = 1;
		numberOfBullet = 1;
		InvulnerableTime = 150;
		this.gameModel = gameModel;

		textures = new Image[4];
		if(type.equals( "1P")){
			//玩家1游戏开启时位置
			xPos  = 198;
			yPos = 498;
			//玩家1的图像
			for(int i = 0; i < 4; i ++)
				textures[i] = gameModel.textures[54+i];
			standardImage = textures[0];
		}else{
			//玩家2游戏开启时位置
			xPos  = 323;
			yPos = 498;
			//玩家2的图像
			for(int i = 0; i < 4; i ++)
				textures[i] = gameModel.textures[72+i];
			standardImage = textures[0];
		}

		xVPos = xPos;
		yVPos = yPos;
		border = new Rectangle(xPos - size, yPos - size, 25, 25);

	}

	public void move(){
       if(gameModel.gamePaused){
       		writeToOutputLine();
		    return;
		}

       if(coolDownTime > 0)
			coolDownTime--;
		if(InvulnerableTime > 0)
			InvulnerableTime--;

		 if(freezed == 1){
        	writeToOutputLine();
        	return;
		}

		//如果玩家点击“开火”键，并且满足条件，则创建一个子弹目标（即发射子弹）
		if(fire && coolDownTime == 0 && numberOfBullet > 0){
			//子弹方向
			int c = direction;
			//子弹位置
			int a, b;
			if(direction == UP){
				a = xPos; b = yPos - size;
			}else if(direction == DOWN){
				a = xPos; b = yPos + size;
			}else if(direction == LEFT){
				a = xPos - size; b = yPos;
			}else{
				a = xPos + size; b = yPos;
			}
			//子弹速度
			int d;
			if(status == 1){
				numberOfBullet = 1;
				d = 7;
			}else{
				d = 12;
			}
			//子弹能力
			int e;
			if(status == 4){
				e = 2;
			}else{
				e = 1;
			}
			//添加子弹
			gameModel.addActor(new bullet(a,b,c,d,e, this, gameModel));
			//coolDownTime是你要等到你可以发射第二颗子弹时间（与魔兽争霸3相同）
			if(status> 2)
				coolDownTime = 5;
			else
				coolDownTime = 8;
			//减少子弹的可用数，子弹发射时numberOfBullet会增加
			//由玩家的丧尸击中目标（例如，墙壁，敌人丧尸等）；
			numberOfBullet--;
		}


		//保存当前位置信息，如果新的移动确定后无效，则更改
		//以前的位置
		int xPosTemp = xPos;
		int yPosTemp = yPos;
		Rectangle borderTemp = new Rectangle(xPosTemp - size, yPosTemp - size, 25,25);

		//根据玩家丧尸的移动定义玩家丧尸的下一个边界，假设它的下一个移动是有效的；
		boolean notMoving = false;
		if(moveUp){
			if(direction != UP && direction != DOWN)
				xPos = xVPos;
			yPos-=speed;
			direction = UP;
		}else if(moveDown){
			if(direction != UP && direction != DOWN)
				xPos = xVPos;
			yPos+=speed;
			direction = DOWN;
		}else if(moveLeft){
			if(direction != LEFT && direction != RIGHT)
				yPos = yVPos;
			xPos-=speed;
			direction = LEFT;
		}else if(moveRight){
			if(direction != LEFT && direction != RIGHT)
				yPos = yVPos;
			xPos+=speed;
			direction = RIGHT;
		}else{
				notMoving = true;
		}
		if(notMoving){
			if(speed > 0)
				speed--;
		}else{
			if(speed < 3)
				speed++;
		}

		//更新边界
		border.y = yPos - size;
		border.x = xPos - size;

		//检查下一个边界是否与地图边界相交，如果不移动到任何地方
		if(!border.intersects(map)){
				xPos = xVPos; yPos = yVPos;
				border.x  = xPos - size; border.y = yPos - size;
				writeToOutputLine();
				return;
			}


		//检查下个边界是否与其他对象相交，如玩家控制的丧尸，墙等等
		for(int i = 0; i < gameModel.actors.length; i++){
			if(gameModel.actors[i] != null){
				if(this != gameModel.actors[i] ){
					if(border.intersects(gameModel.actors[i].getBorder())){
						//吃到道具
						if(gameModel.actors[i].getType().equals("powerUp")){
							scores+=50;
							powerUp temp = (powerUp)gameModel.actors[i];
							int function = temp.function;
							if(function == 0){  //普通武器，增加速度
								upgrade();
							}else if(function == 1){  //钢墙保护基地
								base tempe = (base)gameModel.actors[4];
								tempe.steelWallTime = 600;
							}else if(function == 2){   // 杀死所有的敌方丧尸
								for(int j = 0; j < gameModel.actors.length; j++)
									if(gameModel.actors[j] != null)
										if(gameModel.actors[j].getType().equals("enemy")){
											enemy tempe = (enemy)gameModel.actors[j];
											gameModel.addActor(new bomb(tempe.xPos, tempe.yPos, "big", gameModel));
											gameModel.removeActor(gameModel.actors[j]);
										}
									level.NoOfEnemy = 0;
									level.deathCount = 20 - level.enemyLeft;
							}else if(function == 3){   //防护盾，刀枪不入
								InvulnerableTime = 300 + (int)Math.random()*400;
							}else if(function == 4){  //冻结所有敌人
								enemy.freezedTime = 300 + (int)Math.random()*400;
								enemy.freezedMoment = ServerModel.gameFlow;
							}else if(function == 5){ //超级星星
								if(status < 3)
									numberOfBullet++;
								status =4;
								health = 2;
								if(type.equals("1P"))
									for(int j = 0; j < 4; j ++)
										textures[j] = gameModel.textures[66+j];
								else
									for(int j = 0; j < 4; j ++)
										textures[j] = gameModel.textures[84+j];
							}else if(function == 6){  // 增加生命
								life++;
							}

							gameModel.removeActor(gameModel.actors[i]);

						}
						//静态对象，如墙壁，河流
						else if(gameModel.actors[i].getType().equals("steelWall") || gameModel.actors[i].getType().equals("wall")){
							if(!gameModel.actors[i].walldestoried()){
								for(int j = 0;j < gameModel.actors[i].getDetailedBorder().length; j++){
									if( gameModel.actors[i].getDetailedBorder()[j] != null){
										if(gameModel.actors[i].getDetailedBorder()[j].intersects(border)){
												xPos = xVPos; yPos = yVPos;
												border.x  = xPos - size; border.y = yPos - size;
												writeToOutputLine();
												return;
										}
									}
								}
							}
						}
						else if(gameModel.actors[i].getType().equals("river") || gameModel.actors[i].getType().equals("base")){
							xPos = xVPos; yPos = yVPos;
							border.x  = xPos - size; border.y = yPos - size;
							writeToOutputLine();
							return;
						}
						//移动对象，例如敌人丧尸
						else if(gameModel.actors[i].getType().equals("enemy") || gameModel.actors[i].getType().equals("Player") ){
							if(!borderTemp.intersects(gameModel.actors[i].getBorder()) || gameModel.actors[i].getType().equals("enemy")){
								xPos = xPosTemp;
								yPos = yPosTemp;
								border.x  = xPos - size; border.y = yPos - size;
								writeToOutputLine();
								return;
							}
						}
					}
				}
			}
		}

		//找到丧尸的虚拟位置，当90度转弯时，虚拟位置用来调整丧尸的真实位置。
		int a = (xPos - 10)/25;
		int b = (xPos - 10)%25;
		if(b < 7)
			b = 0;
		if(b > 18)
			b = 25;
		if((b < 19 && b > 6) || xPos < 17 || xPos > 492)
			b = 13;
		xVPos = a*25 + b + 10;
		int c = (yPos - 10)/25;
		int d = (yPos - 10)%25;
		if(d < 7)
			d = 0;
		if(d > 18)
			d = 25;
		if((d < 19 && d > 6) || yPos < 17 || yPos > 492)
			d = 13;
		yVPos = c*25 + d + 10;

		writeToOutputLine();
	}

	public void writeToOutputLine(){
		//将变化写入输出行
		gameModel.outputLine+="n"+ xPos + "," + yPos + ",";
		int textureIndex = 0;
		if(type.equals("1P")){
			if(status == 1)
				textureIndex = 54 + direction;
			else if (status == 2)
				textureIndex = 58 + direction;
			else if(status == 3)
				textureIndex = 62 + direction;
			else
				textureIndex = 66 + direction;
		}else{
			if(status == 1)
				textureIndex = 72 + direction;
			else if (status == 2)
				textureIndex = 76 + direction;
			else if(status == 3)
				textureIndex = 80 + direction;
			else
				textureIndex = 84 + direction;
		}


		gameModel.outputLine+= "" + textureIndex + ";";

		if(InvulnerableTime > 0)
			gameModel.outputLine+="i"+ xPos + "," + yPos + ";";
	}

	public void draw(Graphics g){
		//绘制玩家战士
		g.drawImage(textures[direction], xPos - size, yPos - size, null);
		if(InvulnerableTime > 0){
			g.setColor(Color.red);
			g.drawRect(xPos - 12, yPos - 12, 25,25);
			g.drawRect(xPos - 11, yPos - 11, 23,23);
		}

		//关于玩家的信息，如分数，生命等
		if(type.equals("1P")){
			g.setColor(Color.yellow);
			g.drawImage(standardImage,  520, 380, null );
			g.drawString("x", 555, 395);
			g.drawString(life + "", 565, 396);
			String SCORE = "000000000" + scores;
			g.drawString(type +" 得分:" + "", 515, 370);
			g.drawString(SCORE.substring(SCORE.length() - 7, SCORE.length()) + "", 566, 370);
		}
		if(type.equals("2P")){
			g.setColor(Color.green);
			g.drawImage(standardImage,  520, 460, null );
			g.drawString("x", 555, 475);
			g.drawString(life + "", 565, 476);
			String SCORE = "000000000" + scores;
			g.drawString(type +" 得分:" + "", 515, 450);
			g.drawString(SCORE.substring(SCORE.length() - 7, SCORE.length()) + "", 566, 450);
		}


	}

	public Rectangle getBorder(){
		return border;
	}

	public String getType(){
		return "Player";
	}

	public void hurt(){
		if(InvulnerableTime != 0)
			return;

		//如果丧尸只有1级的健康状态，被击中，那么玩家丧尸失去一个生命，如果玩家丧尸是最后一次生命，被击中，则game over
		//只有吃掉超级星星时，玩家才会有2级的生命健康状态
		if(health == 1){
			gameModel.addActor(new bomb(xPos, yPos, "big",  gameModel));
			life--;
			if(life == 0){
				xPos = 100000; yPos = 100000;           //this will make the player never come back to the main screen, thus looks like "dead"
				border = new Rectangle(xPos - size, yPos - size, 25, 25);
				xVPos = xPos; yVPos = yPos;
				return;
			}else{
				direction = UP;
				status = 1;
				health = 1;
				numberOfBullet = 1;
				InvulnerableTime = 150;
				if(type.equals( "1P")){
					xPos  = 198;
					yPos = 498;
					border = new Rectangle(xPos - size, yPos - size, 25, 25);
					xVPos = xPos; yVPos = yPos;
					for(int i = 0; i < 4; i ++)
						textures[i] = gameModel.textures[54+i];
				}else{
					xPos = 323;
					yPos = 498;
					border = new Rectangle(xPos - size, yPos - size, 25, 25);
					xVPos = xPos; yVPos = yPos;
					for(int i = 0; i < 4; i ++)
						textures[i] = gameModel.textures[72+i];
				}
			}
		}else{
			health--;
			status = 3;
			if(type.equals( "1P")){
				for(int i = 0; i < 4; i ++)
					textures[i] = gameModel.textures[62+i];
			}else{
				for(int i = 0; i < 4; i ++)
					textures[i] = gameModel.textures[80+i];
			}
		}
	}

	public void upgrade(){
		//当玩家丧尸吃掉正常的武器时，他的子弹将会升级
		if(type.equals( "1P")){
			if(status == 1){
				status = 2;
				for(int i = 0; i < 4; i ++)
					textures[i] = gameModel.textures[58+i];
			}else if(status == 2){
				status = 3;
				numberOfBullet ++;
				for(int i = 0; i < 4; i ++)
					textures[i] = gameModel.textures[62+i];
			}else if(status == 3){
				status = 4;
				for(int i = 0; i < 4; i ++)
					textures[i] = gameModel.textures[66+i];
			}
		}else{
			if(status == 1){
				status = 2;
				for(int i = 0; i < 4; i ++)
					textures[i] = gameModel.textures[76+i];
			}else if(status == 2){
				status = 3;
				numberOfBullet ++;
				for(int i = 0; i < 4; i ++)
					textures[i] = gameModel.textures[80+i];
			}else if(status == 3){
				status = 4;
				for(int i = 0; i < 4; i ++)
					textures[i] = gameModel.textures[84+i];
			}
		}
	}

	public void reset(){
		direction = UP;
		InvulnerableTime = 150;
		if(type.equals( "1P")){
			xPos  = 198;
			yPos = 498;
		}else{
			xPos  = 323;
			yPos = 498;
		}

		xVPos = xPos;
		yVPos = yPos;
		border = new Rectangle(xPos - size, yPos - size, 25, 25);
	}

	//未使用的方法
	public Rectangle[] getDetailedBorder(){return null;}
	public boolean walldestoried(){return false;}

}
