package org.digitinary.training.creator;

import org.digitinary.training.product.Pizza;
import org.digitinary.training.product.ChicagoStyleCheesePizza;
import org.digitinary.training.product.ChicagoStyleClamPizza;
import org.digitinary.training.product.ChicagoStylePepperoniPizza;
import org.digitinary.training.product.ChicagoStyleVeggiePizza;

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
