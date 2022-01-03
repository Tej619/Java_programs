import java.awt.*;
import java.applet.*;

/*<html> <applet code = "face" width =300 height=300> </applet> </html> */
public class face extends Applet
{
public void paint(Graphics g)
	{
	g.setColor(Color.yellow);
	g.fillOval (100,100,100,100);
	g.setColor (Color.black);
	g.fillOval(120,125,20,30);	
	g.fillOval(160,125,20,30);
	g.setColor(Color.black);
	g.drawLine(150,165,150,150);	
	g.setColor(Color.red);
	g.fillRect(130,170,40,10);
	g.setColor (Color.black);
	g.drawLine(131,174,169,174);
	}
}