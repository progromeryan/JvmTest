package headfirst.combining.factory;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/9/18.
 */
public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();

    public void add(Quackable quackable)
    {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext())
        {
            Quackable quackable = (Quackable)iterator.next();
            quackable.quack();
        }
    }
}
