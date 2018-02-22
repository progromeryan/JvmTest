package headfirst.combining.observer;

/**
 * Created by Administrator on 2017/9/19.
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: "+duck+" just quacked." );
    }
}
