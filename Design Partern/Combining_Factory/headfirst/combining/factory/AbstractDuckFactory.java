package headfirst.combining.factory;

import headfirst.strategy.Quack;

/**
 * Created by Administrator on 2017/9/18.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
