package headfirst.templatemethod.barista;

/**
 * Created by Administrator on 2017/9/1.
 */
public abstract class CaffeineBeverageWithHook {
    void prepareRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
        {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater()
    {
        System.out.println("Boiling water");
    }

    void pourInCup()
    {
        System.out.println("Pouring into Cup");
    }

    boolean customerWantsCondiments()
    {
        return  true;
    }
}
