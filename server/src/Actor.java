//创建接口
import java.awt.*;
//2013747张怡桢
public interface Actor{
	public void draw(Graphics g);
	public void move();
	public String getType();
	public Rectangle getBorder();
	public Rectangle[] getDetailedBorder();
	public boolean walldestoried();
}