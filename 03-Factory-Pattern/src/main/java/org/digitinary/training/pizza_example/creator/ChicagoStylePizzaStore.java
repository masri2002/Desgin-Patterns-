package org.digitinary.training.pizza_example.creator;

import org.digitinary.training.pizza_example.product.Pizza;
import org.digitinary.training.pizza_example.product.ChicagoStyleCheesePizza;
import org.digitinary.training.pizza_example.product.ChicagoStyleClamPizza;
import org.digitinary.training.pizza_example.product.ChicagoStylePepperoniPizza;
import org.digitinary.training.pizza_example.product.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    Pizza pizza;
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
