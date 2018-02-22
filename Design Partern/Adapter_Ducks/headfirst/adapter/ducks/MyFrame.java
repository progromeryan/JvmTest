package headfirst.adapter.ducks;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/9/1.
 */
public class MyFrame extends JFrame
{
    public MyFrame(String title)
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!";
        getGraphics().drawString(msg,100,100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
