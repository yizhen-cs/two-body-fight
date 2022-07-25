import java.awt.*;
//2013747张怡桢
public class enemy implements Actor{
	public final int UP = 0;
	public final int DOWN = 1;
	public final int LEFT = 2;
	public final int RIGHT = 3;
	public final int size = 12;
	public final Rectangle map = new Rectangle(35, 35, 452, 452);
	public static int freezedTime;
	public static int freezedMoment;
	public int numberOfBullet;
	public int coolDownTime;
	public int type;
	public int speed;
	public int direction;
	public int interval;
	public int health;;
	public int xPos, yPos, xVPos, yVPos;
	public Rectangle border;
	public boolean flashing;
	public double firePosibility;
	public Image[] textures;
	public ServerModel gameModel;

	public enemy(int type,  boolean flashing, int xPos, int yPos, ServerModel gameModel){
		this.type = type;
		this. xPos = xPos;
		this.yPos = yPos;
		this.flashing = flashing;
		this.gameModel = gameModel;

		//设置全部敌人的共同属性
		interval = (int)(Math.random()*200);
		direction = (int)(Math.random()*4);
		numberOfBullet = 1;
		xVPos = xPos;
		yVPos = yPos;
		border = new Rectangle(xPos - size, yPos - size, 25, 25);


		//根据不同类型的敌人设置独特的属性如：容貌,速度,等等
		if(type ==1 ){
			firePosibility = 0.95;
			speed = 2;
			textures = new Image[8];
			for(int i = 0; i < 8; i++)
				textures[i] = gameModel.textures[38+i];
		}else if(type == 2){
			firePosibility = 0.95;
			speed = 4;
			textures = new Image[8];
			for(int i = 0; i < 8; i++)
				textures[i] = gameModel.textures[2+i];
		}else if(type == 3){
			firePosibility = 0.9;
			speed = 2;
			textures = new Image[8];
			for(int i = 0; i < 8; i++)
				textures[i] = gameModel.textures[10+i];
		}else{
			firePosibility = 0.95;
			health = 3;
			speed = 2;
			textures = new Image[20];
			for(int i = 0; i < 20; i++)
				textures[i] = gameModel.textures[18+i];

		}

	}

	public void move(){
       if(gameModel.gamePaused){
	         writeToOutputLine();
	  		 return;
		}

      if(freezedTime > ServerModel.gameFlow - freezedMoment){
	   		writeToOutputLine();
	   		return;
		}


       //敌方丧尸在一个周期内将会朝着相同的方向继续移动（如果不与其他对象相互影响）
        //在每个周期结束时，它将转向新的方向
        if(interval > 0)
        	interval--;
        if(interval == 0){
			interval = (int)(Math.random()*200);
			int newDirection = (int)(Math.random()*4);
			if(direction != newDirection){
				if(direction/2 != newDirection/2){
					xPos = xVPos; yPos = yVPos;
					border.x = xPos - size; border.y = yPos - size;
				}
				direction = newDirection;
			}

		}


		//完全随机的决定是否要发射一颗子弹，敌方丧尸不能开火
		//如果第一个不是摧毁的子弹
		if(coolDownTime > 0)
			coolDownTime--;
		if(Math.random() > firePosibility && coolDownTime == 0 && numberOfBullet > 0){
			//获得子弹方向
			int c = direction;
			//获得子弹位置
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
			//获得子弹速度
			int d;
			if(type == 3){
				d = 12;
			}else{
				d = 7;
			}
			//添加子弹
			gameModel.addActor(new bullet(a,b,c,d,1, this, gameModel));
			coolDownTime = 7;
			if(type == 3)
				coolDownTime = 5;
			numberOfBullet--;
		}

		//保存当前位置信息,如果确定了新举措无效后,然后改变
		
		int xPosTemp = xPos;
		int yPosTemp = yPos;
		Rectangle borderTemp = new Rectangle(xPosTemp - size, yPosTemp - size, 25,25);

		//定义地方丧尸的下一个边界，假设它有效的根据方向来进行移动
		if(direction == UP){
			yPos-=speed;
		}else if(direction == DOWN){
			yPos+=speed;
		}else if(direction == LEFT){
			xPos-=speed;
		}else{
			xPos+=speed;
	    }


		//更新边界
		border.y = yPos - size;
		border.x = xPos - size;

		//检查下一个边界是否会与地图边界相交，如果不相交则随机生成边界
		if(!border.intersects(map)){
			direction = (int)(Math.random()*4);
			interval = (int)(Math.random()*250);
			xPos = xVPos; yPos = yVPos;
			border.x = xPos - size; border.y = yPos - size;
			writeToOutputLine();
			return;
		}

	//检查下一个边界是否与其他对象相交，例如玩家控制的丧尸，墙等等
		for(int i = 0; i < gameModel.actors.length; i++){
			if(gameModel.actors[i] != null){
				if(this != gameModel.actors[i] ){
					if(border.intersects(gameModel.actors[i].getBorder())){
						//静态对象，例如河流，墙等等
						if(gameModel.actors[i].getType().equals("steelWall") || gameModel.actors[i].getType().equals("wall")){
							if(!gameModel.actors[i].walldestoried()){
								for(int j = 0;j < gameModel.actors[i].getDetailedBorder().length; j++){
									if( gameModel.actors[i].getDetailedBorder()[j] != null){
										if(gameModel.actors[i].getDetailedBorder()[j].intersects(border)){
											if(Math.random() > 0.90)
												direction = (int)(Math.random()*4);
											xPos = xVPos; yPos = yVPos;
											border.x  = xPos - size; border.y = yPos - size;
											writeToOutputLine();
											return;
										}
									}
								}
							}
						}else if(gameModel.actors[i].getType().equals("river") || gameModel.actors[i].getType().equals("base")){
							if(Math.random() > 0.90)
								direction = (int)(Math.random()*4);
							xPos = xVPos; yPos = yVPos;
							border.x  = xPos - size; border.y = yPos - size;
							writeToOutputLine();
							return;
						}
						//其他对象，其他的丧尸
						if(gameModel.actors[i].getType().equals("Player") || gameModel.actors[i].getType().equals("enemy")){
							if(!borderTemp.intersects(gameModel.actors[i].getBorder())){
								xPos = xPosTemp;
								yPos = yPosTemp;
								border.x = xPos - size; border.y = yPos - size;
								int newDirection = (int)(Math.random()*4);
								if(direction != newDirection){
									if(direction/2 != newDirection/2){
										xPos = xVPos; yPos = yVPos;
										border.x = xPos - size; border.y = yPos - size;
									}
									direction = newDirection;
								}
								writeToOutputLine();
								return;
							}
						}
					}
				}
			}
		}


		///当丧尸是90度倾斜时，找到丧尸的虚拟位置，使用虚拟位置调整丧尸的真实位置
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
		if(flashing && gameModel.gameFlow%10 > 4){
			if(type == 1)
				textureIndex = 42+ direction;
			else if(type == 2)
				textureIndex = 6 + direction;
			else if(type == 3)
				textureIndex = 14 + direction;
			else
				textureIndex = 34 + direction;
		}else{
			if(type == 1)
				textureIndex = 38 + direction;
			else if(type == 2)
				textureIndex = 2 + direction;
			else if(type == 3)
				textureIndex = 10 + direction;
			else{
				if(health == 3)
					textureIndex = 18 + direction;
				else if(health == 2)
					textureIndex = 22 + direction;
				else if(health == 1)
					textureIndex = 26 + direction;
				else
					textureIndex = 30 + direction;
			}
		}
		gameModel.outputLine+= "" + textureIndex + ";";

	}

	//如果丧尸被击中一颗子弹，判断会发生什么
	public void hurt(){
		if(flashing)
			gameModel.addActor(new powerUp(gameModel));
		flashing = false;
		boolean death = false;
		if(type != 4 )
			death = true;
		else{
			if(health == 0)
				death = true;
			else{
				if(health == 3){
					for(int i = 0; i < 4; i++)
						textures[i] = textures[4+i];
				}else if(health == 2){
					for(int i = 0; i < 4; i++)
						textures[i] = textures[8+i];
				}else if(health == 1){
					for(int i = 0; i < 4; i++)
						textures[i] = textures[12+i];
				}
				health--;
			}
		}

		if(death){
			level.NoOfEnemy--;
			level.deathCount++;
			gameModel.removeActor(this);
			gameModel.addActor(new bomb(xPos, yPos, "big", gameModel));
		}
	}

	public String getType(){
		return "enemy";
	}

	public void draw(Graphics g){
		if(flashing && gameModel.gameFlow%10 > 4)
			g.drawImage(textures[textures.length-4+direction], xPos - size, yPos - size, null);
		else
			g.drawImage(textures[direction], xPos - size, yPos - size, null);
	}

	public Rectangle getBorder(){
		return border;
	}

	//未使用的方法
	public Rectangle[] getDetailedBorder(){return null;}
	public boolean walldestoried(){return false;}
}