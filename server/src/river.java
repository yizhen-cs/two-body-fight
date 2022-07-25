import java.awt.*;
//2013747张怡桢
public class river implements Actor{
	private int xPos;
	private int yPos;
	private Rectangle Border;
	public Image river;
	public ServerModel gameModel;

	//设置基本属性
	public river(int a, int b, ServerModel gameModel){
		this.gameModel = gameModel;
		river = gameModel.textures[71];
		xPos = a;
		yPos = b;
		Border = new Rectangle(xPos - 12, yPos - 12, 25, 25);
	}

	public Rectangle getBorder(){
		return Border;
	}

	public int getxPos(){
		return xPos;
	}

	public int getyPos(){
		return yPos;
	}

	public String getType(){
		return "river";
	}

	//画出河道
	public void draw(Graphics g){
		g.drawImage(river, xPos - 12, yPos - 12, null);
	}



	//未使用的方法
	public void move(){}
	public Rectangle[] getDetailedBorder(){return null;}
	public boolean walldestoried(){return false;}

}

