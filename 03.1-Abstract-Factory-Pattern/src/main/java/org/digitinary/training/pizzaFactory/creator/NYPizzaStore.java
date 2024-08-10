package org.digitinary.training.pizzaFactory.creator;

import org.digitinary.training.pizzaFactory.product.*;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
            pizza.prepare();

        } else if (item.equals("veggie")) {

            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
            pizza.prepare();

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
            pizza.prepare();

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
            pizza.prepare();
        }
        return pizza;
    }
}