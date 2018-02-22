package headfirst.adapter.ducks;

/**
 * Created by Administrator on 2017/8/28.
 */
public class MallardDuck implements Duck
{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
