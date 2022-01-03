import java.awt.*;
import java.applet.*;
public class MyShapes extends Applet
{
 public void paint(Graphics g)
	{
	g.drawLine(10,100,10,200);
	g.drawRect(20,20,200,100);
	g.fillRect(20,130,200,100);
	g.drawOval(230,20,200,100);
	g.fillOval(230,130,100,200);
	}
}