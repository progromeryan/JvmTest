package headfirst.adapter.ducks;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Administrator on 2017/9/1.
 */
public class MyApplet extends Applet
{
    String message;

    @Override
    public void init() {
        message = "hello World,I'm alive!";
        repaint();
    }

    public void start()
    {
        message = "Now I'm starting up....";
        repaint();
    }

    @Override
    public void stop() {
        message = "oh,now I'm being stopped....";
        repaint();
    }

    @Override
    public void destroy() {
        message = "oh,now I'm being destroy....";
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message,5,15);
    }
}
