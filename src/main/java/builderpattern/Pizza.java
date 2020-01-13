package builderpattern;
import ingredients.Cheese;
import ingredients.Dough;
import ingredients.Topping;
import ingredients.PizzaType;

public class Pizza {
    private PizzaType pizzaType;
    private Dough dough;
    private Cheese cheese;
    private Topping topping;
    private int size;

    public Pizza(PizzaType pizzaType, Dough dough, Cheese cheese, Topping topping, int size) {
        this.pizzaType = pizzaType;
        this.dough = dough;
        this.cheese = cheese;
        this.topping = topping;
        this.size = size;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Dough getDough() {
        return dough;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Topping getTopping() {
        return topping;
    }

    public int getSize() {
        return size;
    }
}
