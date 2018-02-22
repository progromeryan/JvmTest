package headfirst.combining.factory;

import headfirst.strategy.Quack;

/**
 * Created by Administrator on 2017/9/18.
 */
//public class DuckSimulator {
//    public static void main(String[] args) {
//        DuckSimulator simulator = new DuckSimulator();
//        simulator.simulate();
//
//    }
//    void simulate()
//    {
//        Quackable mallardDuck = new QuackCounter(new MallardDuck());
//        Quackable redheadDuck = new QuackCounter( new RedHeadDuck());
//        Quackable duckCall = new QuackCounter( new DuckCall());
//        Quackable rubberDuck = new QuackCounter(new RubberDuck());
//        Quackable gooseDuck =new GooseAdapter(new Goose());
//
//        System.out.println("\nDuck Simulator");
//
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);
//
//        System.out.println("The ducks quacked "+QuackCounter.getQuacks() +" times");
//    }
//
//    void simulate(Quackable duck)
//    {
//        duck.quack();
//    }
//}
public  class DuckSimulator{
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        duckSimulator.simulate(duckFactory);
    }

//    void simulate(AbstractDuckFactory  duckFactory)
//    {
//        Quackable mallardDuck= duckFactory.createMallardDuck();
//        Quackable redheadDuck = duckFactory.createRedheadDuck();
//        Quackable duckCall = duckFactory.createDuckCall();
//        Quackable rubberDuck = duckFactory.createRubberDuck();
//        Quackable gooseDuck = new GooseAdapter(new Goose());
//
//        System.out.println("\nDuck Simulator: With Composite - Flocks");
//
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);
//
//        System.out.println("The ducks quacked "+QuackCounter.getQuacks() +" times");
//    }


    void simulate(AbstractDuckFactory  duckFactory)
    {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);
        System.out.println("\nDuck Simulator:Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator:Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked "+QuackCounter.getQuacks() +" times");
    }

    void simulate(Quackable duck)
    {
        duck.quack();
    }
}
