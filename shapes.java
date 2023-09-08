import java.awt.*;
import java.applet.*;
/*
<applet code= "shapes.class" width=1000
height=500>
</applet>
*/

public class shapes extends Applet
{
    Font fob=new Font("Times New Roman",Font.BOLD,20);
    public void paint(Graphics g)
    
    {
        g.setFont(fob);
        g.drawString("Hello World", 200, 200);
        g.drawLine(50,600,600,500);
        g.drawRect(10,25,50,40);
        g.drawOval(100,200,200,400);
        g.setColor(Color.red);
        g.fillRect(10,25,50,40);
        g.drawArc(250,300,75,50,0,-180);
    }
}