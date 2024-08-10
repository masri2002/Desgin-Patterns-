package org.digitinary.training.pizzaFactory.creator;


import org.digitinary.training.pizzaFactory.product.Pizza;

public abstract class PizzaStore {
      public Pizza orderPizza(String type){
            Pizza pizza ;
            pizza=createPizza(type);
            return pizza;
      }
      abstract Pizza createPizza(String type);
}