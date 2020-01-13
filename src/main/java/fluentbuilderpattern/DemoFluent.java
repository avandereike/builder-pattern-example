package fluentbuilderpattern;

import builderpattern.Pizza;
import ingredients.Cheese;
import ingredients.Dough;
import ingredients.PizzaType;
import ingredients.Topping;

public class DemoFluent {
    public static void main(String[] args) {

        //Fluent Builder pattern

        Pizza pizza = new PizzaFluentBuilder()
                .withPizzaType(PizzaType.SALAMI_PIZZA)
                .withDough(Dough.CLASSIC)
                .withCheese(Cheese.MOZZARELLA)
                .withTopping(Topping.SALAMI)
                .withSize(26)
                .build();
        System.out.println("fluentbuilderpattern.PizzaFluent built: " + pizza.getPizzaType() + " with Ingredients: "
                + pizza.getDough() + ", " + pizza.getCheese() + ", " + pizza.getTopping() + " and Size " + pizza.getSize());

    }
}
