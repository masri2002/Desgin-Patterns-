package org.digitinary.training.pizza_example.creator;


import org.digitinary.training.pizza_example.product.Pizza;

public abstract class PizzaStore {
      public Pizza orderPizza(String type){
            Pizza pizza ;
            pizza=createPizza(type);
            return pizza;
      }
      abstract Pizza createPizza(String type);
}