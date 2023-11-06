import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.awt.Point;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
public class PaintPanel extends JPanel
{
    private final ArrayList<Point> points = new ArrayList<>();
    
    public PaintPanel()
    {
        addMouseMotionListener(
            new MouseMotionAdapter()
            {
                @Override
                public void mouseDragged(MouseEvent event)
                {
                    points.add(event.getPoint());
                    repaint();
                }
            }
        );
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (Point point : points)
        g.fillOval(point.x, point.y, 4,4);
    }
}
