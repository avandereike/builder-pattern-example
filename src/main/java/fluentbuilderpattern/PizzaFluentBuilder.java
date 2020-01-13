package fluentbuilderpattern;

import builderpattern.Pizza;
import ingredients.Cheese;
import ingredients.Dough;
import ingredients.PizzaType;
import ingredients.Topping;

public class PizzaFluentBuilder {
    private PizzaType pizzaType;
    private Dough dough;
    private Cheese cheese;
    private Topping topping;
    private int size;

    public PizzaFluentBuilder withPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
        return this;
    }

    public PizzaFluentBuilder withDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    public PizzaFluentBuilder withCheese(Cheese cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaFluentBuilder withTopping(Topping topping) {
        this.topping = topping;
        return this;
    }

    public PizzaFluentBuilder withSize(int size) {
        this.size = size;
        return this;
    }

    public Pizza build() {
        return new Pizza(pizzaType, dough, cheese, topping, size);
    }
}
