import java.awt.*;
import javax.swing.*;
//2013747张怡桢
//drawingPanel类属于服务器程序
public class drawingPanel extends JPanel{
	public Image offScreenImage;

	//这些是指出在serverModel都是真实的东西的参考
	public String[] messageQueue;
	public Actor[] actors;
	public boolean gameStarted;
	public int green, red, blue;

	public drawingPanel() {}

	public void paintComponent(Graphics g) {
		Graphics offScreenGraphics;
		if (offScreenImage == null) {
				offScreenImage = createImage(640, 550);
		}
		offScreenGraphics = offScreenImage.getGraphics();
		myPaint(offScreenGraphics);
		g.drawImage(offScreenImage, 0, 0, this);
	}

	public void myPaint(Graphics g) {
		super.paintComponent(g);

		if(gameStarted){
			//制作背景
			g.setColor(Color.blue);
			g.drawRect(10, 10, 501, 501);

			//制作丧尸等等
			if(actors != null)
				for(int i = 0; i < actors.length; i++)
					if(actors[i] != null)
						actors[i].draw(g);

			//制作级别关卡
			g.setColor(new Color(81,111, 230));
			g.drawString("第  " + level.currentLevel + "  关", 527, 39);
			g.drawString("剩余丧尸数  " + level.enemyLeft, 527, 79);

			//制作获胜场景
			if(level.winningCount > 150){
				int temp = level.winningCount - 150;
				if(temp*10 >  300)
					temp = 30;
				if(level.winningCount  > 470)
					temp = 500 - level.winningCount;
				g.setColor(new Color(200, 173, 196));
				g.fillRect(11,11, 500, temp*10);
				g.fillRect(11, 500 - temp*10, 500, (1+temp)*10 + 2);

				if(level.winningCount  > 190  &&level.winningCount  < 470){
					if(level.winningCount > 400 ){
						red+=(int)((128-red)*0.2);
						green+=(int)((128-green)*0.2);
					}
					g.setColor(new Color(0,0,0));
					g.drawString("恭 喜 你 过 关 了  ！", 220, 250);
				}
			}else{
				green = 23; red = 34; blue = 128;
			}

		}

		//消息
		g.setColor(new Color(255, 255, 255));
		if(messageQueue  != null){
			for(int i = 0 ; i < 8; i++){
				if(messageQueue[i] != null)
					g.drawString(messageQueue[i] , 5,  12 +i*16);
				else
					break;
			}
		}
	}
}