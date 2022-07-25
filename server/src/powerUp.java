import java.awt.*;
//2013747张怡桢
public class powerUp implements Actor{
	private int xPos;
	private int yPos;
	public int function;
	public Rectangle border;
	public int displaytime;
	public Image[] textures;
	public ServerModel gameModel;

	public powerUp(ServerModel gameModel){
		this.gameModel = gameModel;
		//加载图像
		textures = new Image[7];
		for(int i = 0; i < 7; i ++)
			textures[i] = gameModel.textures[46+i];

		xPos = 24 + (int)(Math.random()*475);
		yPos = 24 + (int)(Math.random()*475);
		int a = (int)(Math.random()*17);
		if(0 <= a && a< 3)
			function = 0;
		if(3 <= a && a < 6)
			function = 1;
		if(6 <= a && a < 9)
			function = 2;
		if(9 <= a && a< 12)
			function = 3;
		if(12 <= a && a < 15)
			function = 4;
		if(15 <= a && a < 16)
			function = 5;
		if(16 <= a && a < 17)
			function = 6;
		displaytime = 100 + (int)(Math.random()*630);
		border= new Rectangle(xPos - 12, yPos -12, 25, 25);
	}

	public Rectangle getBorder(){
		return border;
	}

	public int getFunction(){
		return function;
	}

	public String getType(){
		return "powerUp";
	}

	public void move(){
		displaytime--;
		if(displaytime == 0)
			gameModel.removeActor(this);

		//将变化写入输出行
		gameModel.outputLine+="n"+ xPos + "," + yPos + ",";
		gameModel.outputLine+= "" + (46 + function) + ";";
	}

	public void draw(Graphics g){
		g.drawImage(textures[function], xPos - 12, yPos - 12, null);
	}

	//未使用的方法
	public Rectangle[] getDetailedBorder(){return null;}
	public boolean walldestoried(){return false;};

}