package org.digitinary.training.pizza_example;

import org.digitinary.training.pizza_example.creator.ChicagoStylePizzaStore;
import org.digitinary.training.pizza_example.creator.NYStylePizzaStore;
import org.digitinary.training.pizza_example.creator.PizzaStore;
import org.digitinary.training.pizza_example.product.Pizza;

public class PizzaOrders {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ahmad ordered a " + pizza.getName());

        System.out.println("#####################################################");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Amena ordered a " + pizza.getName() );
    }
}
