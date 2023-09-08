import java.awt.*;
import java.applet.*;
/*
<applet code= "firstapplet.class" width=1000
height=500>
</applet>
*/

public class firstapplet extends Applet
{
    public void paint(Graphics g)
    {
    Font fob = new Font("Arial",Font.BOLD,20);
    g.setFont(fob);
    g.setColor(Color.green);
    g.drawString("Welcome to applet",50,300);
    g.setColor(Color.red);
    g.drawLine(50,100,300,100);
    g.drawLine(50,100,50,200);
    g.drawLine(300,100,200,200);
    g.drawLine(50,200,300,350);
    }
}