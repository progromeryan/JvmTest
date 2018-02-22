package headfirst.adapter.ducks;

/**
 * Created by Administrator on 2017/8/28.
 */
public class WildTurkey implements  Turkey
{
    @Override
    public void gobble() {
        System.out.println("Glbble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
