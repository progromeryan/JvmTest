package headfirst.templatemethod.barista;

/**
 * Created by Administrator on 2017/9/1.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee..");
        coffeeWithHook.prepareRecipe();
    }
}
