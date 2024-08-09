package org.digitinary.training.pizza_example.creator;

import org.digitinary.training.pizza_example.product.NYStylePepperoniPizza;
import org.digitinary.training.pizza_example.product.Pizza;
import org.digitinary.training.pizza_example.product.NYStyleCheesePizza;
import org.digitinary.training.pizza_example.product.NYStyleClamPizza;
import org.digitinary.training.pizza_example.product.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore{
    Pizza pizza;
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
