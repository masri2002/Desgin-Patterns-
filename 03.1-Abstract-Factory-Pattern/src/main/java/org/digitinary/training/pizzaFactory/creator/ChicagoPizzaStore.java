package org.digitinary.training.pizzaFactory.creator;

import org.digitinary.training.pizzaFactory.product.*;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
            pizza.prepare();
        } else if (item.equals("veggie")) {

            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
            pizza.prepare();
        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
            pizza.prepare();
        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
            pizza.prepare();
        }
        return pizza;
    }
}