import java.awt.*;
//2013747张怡桢
public class base implements Actor{
	private Rectangle border;
	public Image base;
	public int xPos, yPos;
	public ServerModel gameModel;
	public int steelWallTime;
	public boolean baseKilled;

	//基地的基本属性设置
	public base(ServerModel gameModel){
		this.gameModel = gameModel;
		xPos = 260;
		yPos = 498;
		base = gameModel.textures[0];
		border = new Rectangle(xPos - 11, yPos - 11, 23, 23);
	}
	//当玩家吃到基地升级的围墙道具时发生变化
	public Rectangle getBorder(){
		return border;
	}
	//当基地的核心宝藏被丧尸攻击
	public void doom(){
		base = gameModel.textures[1];
		if(!baseKilled)
			gameModel.addActor(new bomb(xPos, yPos, "big", gameModel));
		baseKilled = true;

		//记录变化到输出行
		gameModel.outputLine+="b"+ xPos + "," + yPos + "," + "1;";

	}
	//当基地的墙被丧尸攻击
	public void move(){
		if(steelWallTime == 600){
			Steelwall temp = new Steelwall(248, 498, 2, gameModel);
			gameModel.actors[0] = temp;
			writeToOutputLine("s", temp.shape, 248, 498);

			temp = new Steelwall(273, 498, 3, gameModel);
			gameModel.actors[1] = temp;
			writeToOutputLine("s", temp.shape, 273, 498);

			temp = new Steelwall(248, 473, 1, gameModel);
			gameModel.actors[2] = temp;
			writeToOutputLine("s", temp.shape, 248, 473);

			temp = new Steelwall(273, 473, 1, gameModel);
			gameModel.actors[3] = temp;
			writeToOutputLine("s", temp.shape, 273, 473);
		}
		if(steelWallTime> 0)
			steelWallTime--;
		if(steelWallTime == 1){
			wall temp = new wall(248, 498, 2, gameModel);
			gameModel.actors[0] = temp;
			writeToOutputLine("w", temp.shape, 248, 498);

			temp = new wall(273, 498, 3, gameModel);
			gameModel.actors[1] = temp;
			writeToOutputLine("w", temp.shape, 273, 498);

			temp = new wall(248, 473, 1, gameModel);
			gameModel.actors[2] = temp;
			writeToOutputLine("w", temp.shape, 248, 473);

			temp = new wall(273, 473, 1, gameModel);
			gameModel.actors[3] = temp;
			writeToOutputLine("w", temp.shape, 273, 473);
		}

	}

	public void writeToOutputLine(String type, boolean[] shape, int  xPos, int  yPos){
		//记录变化到输出行
		gameModel.outputLine+=type + xPos + ","+ yPos+",";
		for(int i = 0; i < shape.length; i++){
			if(shape[i])
				gameModel.outputLine+="1";
			else
				gameModel.outputLine+="0";
		}
		gameModel.outputLine+=";";
	}
	//返回基地的类型
	public String getType(){
		return "base";
	}
	//画出基地
	public void draw(Graphics g){
		g.drawImage(base, xPos - 12, yPos - 12, null );
	}

	//未使用的方法
	public Rectangle[] getDetailedBorder(){return null;}
	public boolean walldestoried(){return false;}

}