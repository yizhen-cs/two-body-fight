import java.awt.*;
//2013747张怡桢
public class grass implements Actor{
	private int xPos;
	private int yPos;
	public Rectangle border;

	//grass类构造器定义了草坪的x，y坐标和矩形边界以及图标;
	public grass(int a, int b){
		xPos = a;
		yPos = b;
		border = new Rectangle(0,0,0,0);
	}
	//画出草坪
	public void draw(Graphics g) {
//		g.setColor(new Color(0, 225, 0,99));
//		for(int i = yPos - 11; i <= yPos + 12; i+=5)
//			g.drawLine(xPos - 12, i, xPos + 12, i);
//		for(int i = xPos - 11; i <= xPos + 12; i+=5)
//			g.drawLine(i, yPos - 12, i, yPos + 12);
		g.setColor(new Color(0, 128, 0));
		for(int i = yPos - 10; i <= yPos + 12; i+=5)
			g.drawLine(xPos - 12, i, xPos + 12, i);
		for(int i = xPos - 10; i <= xPos + 12; i+=5)
			g.drawLine( i, yPos - 12, i, yPos + 12);
	}

	public String getType(){
		return "grass";
	}

	public Rectangle getBorder(){
		return border;
	}

	public void move(){}
	public Rectangle[] getDetailedBorder(){return null;}
	public boolean walldestoried(){return false;}


}