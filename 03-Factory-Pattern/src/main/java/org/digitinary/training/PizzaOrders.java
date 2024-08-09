package org.digitinary.training;

import org.digitinary.training.creator.ChicagoStylePizzaStore;
import org.digitinary.training.creator.NYStylePizzaStore;
import org.digitinary.training.creator.PizzaStore;
import org.digitinary.training.product.Pizza;

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
