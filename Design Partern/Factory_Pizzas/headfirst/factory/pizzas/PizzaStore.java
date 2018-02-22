package headfirst.factory.pizzas;

/**
 * @FileName : (PizzaStore.java)
 * @description :
 */
public abstract class PizzaStore
{
	public Pizza orderPizza(String type)
    {
    	Pizza pizza = createPizza(type);
    	pizza.prepare();		
    	pizza.bake();	
    	pizza.cut();	
    	pizza.box();	
    	return pizza;
    }
	
	abstract Pizza createPizza(String type);
}
