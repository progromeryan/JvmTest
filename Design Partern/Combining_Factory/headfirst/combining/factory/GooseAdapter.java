package headfirst.combining.factory;

/**
 * Created by Administrator on 2017/9/18.
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack()
    {
        goose.honk();
    }
}
