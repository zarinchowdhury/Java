import javax.swing.JFrame;

public class DrawSmileyTest2 {
     public static void main(String[] args)
    {
        DrawSmiley2 panel = new DrawSmiley2();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(330, 350);
        application.setVisible(true);
    }
}
