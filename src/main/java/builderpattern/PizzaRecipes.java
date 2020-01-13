package builderpattern;

import ingredients.Cheese;
import ingredients.Dough;
import ingredients.PizzaType;
import ingredients.Topping;


/**
 * Defines the order of building steps.
 */
public class PizzaRecipes {

    public void  constructSalamiPizza(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setPizzaType(PizzaType.SALAMI_PIZZA);
        pizzaBuilder.setDough(Dough.CLASSIC);
        pizzaBuilder.setTopping(Topping.SALAMI);
        pizzaBuilder.setCheese(Cheese.MOZZARELLA);
        pizzaBuilder.setSize(26);
    }

    public void  constructBaconPizza(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setPizzaType(PizzaType.BACON_PIZZA);
        pizzaBuilder.setDough(Dough.WHOLE_WHEAT);
        pizzaBuilder.setTopping(Topping.BACON);
        pizzaBuilder.setCheese(Cheese.GOUDA);
        pizzaBuilder.setSize(26);
    }

    public void  constructChickenPizza(PizzaBuilder pizzaBuilder){
        pizzaBuilder.setPizzaType(PizzaType.CHICKEN_PIZZA);
        pizzaBuilder.setDough(Dough.CLASSIC);
        pizzaBuilder.setTopping(Topping.CHICKEN);
        pizzaBuilder.setCheese(Cheese.RICOTTA);
        pizzaBuilder.setSize(26);
    }
}
