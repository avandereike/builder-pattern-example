package builderpattern;

import ingredients.Cheese;
import ingredients.Dough;
import ingredients.PizzaType;
import ingredients.Topping;

public class PizzaBuilder {
    private PizzaType pizzaType;
    private Dough dough;
    private Cheese cheese;
    private Topping topping;
    private int size;

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pizza build() {
        return new Pizza(pizzaType, dough, cheese, topping, size);
    }
}
