import java.applet.*;
import java.awt.*;
/* <applet code="coneapp"  width="400" height="500">
</applet>*/
public class coneapp extends Applet
{
 public void paint (Graphics g)
 {
	g.drawRect(50,50,100,100);
	g.setColor(Color.red);
	g.fillRect(50,50,100,100);
	g.drawOval(75,75,50,50);
	g.setColor(Color.blue);
	g.fillOval(75,75,50,50);
  }
}