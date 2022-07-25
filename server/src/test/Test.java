package test;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Test extends JFrame
{
    //创建一个容器
    Container ct;
    //创建背景面板。
    BackgroundPanel bgp;

    //创建一个按钮，用来证明我们的确是创建了背景图片，而不是一张图片。
    JButton jb;
    public static void main(String[] args)
    {
        //System.out.println(new File("").getAbsolutePath());
        new Test();

    }
    public Test()
    {
        //不采用任何布局方式。
        ct=this.getContentPane();
        this.setLayout(null);

        //在这里随便找一张400*300的照片既可以看到测试结果。
        Image  image=(new ImageIcon("images/bg.jpg")).getImage();
        Image image2=Toolkit.getDefaultToolkit().getImage("images/bg.jpg");



        bgp=new BackgroundPanel(image2);
        bgp.setBounds(0,0,516,320);
        ct.add(bgp);

        //创建按钮
        jb=new JButton("测试按钮");
        jb.setBounds(60,30,160,30);
        ct.add(jb);

        this.setSize(400,300);
        this.setLocation(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class BackgroundPanel extends JPanel
{
    Image im;
    public BackgroundPanel(Image im)
    {
        this.im=im;
        this.setOpaque(true);
    }
    //Draw the back ground.
    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);

    }
}