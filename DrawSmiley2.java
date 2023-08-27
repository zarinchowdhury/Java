import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawSmiley2 extends JPanel {
     public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

		g.setColor(Color.yellow);
		g.fillOval(0,0,300,300);
		
		
		g.setColor(Color.white);
		g.fillOval(180,90,60,60);
		g.fillOval(60,90,60,60);
		
		g.setColor(Color.black);
		g.drawLine(150,170,150,120);
		g.drawArc(60,160,180,60,180,180);	
    }
}
