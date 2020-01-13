package builderpattern;

public class Demo {

    public static  void main(String[] args) {

        //Builder pattern
        PizzaRecipes pizzaRecipes = new PizzaRecipes();

        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaRecipes.constructSalamiPizza(pizzaBuilder);

        Pizza pizza = pizzaBuilder.build();
        System.out.println("builderpattern.Pizza built:" + pizza.getPizzaType());

    }
}
