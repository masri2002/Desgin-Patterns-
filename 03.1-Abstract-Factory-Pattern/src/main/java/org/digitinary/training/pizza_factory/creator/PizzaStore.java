package org.digitinary.training.pizza_factory.creator;


import org.digitinary.training.pizza_factory.product.Pizza;

public abstract class PizzaStore {
      public Pizza orderPizza(String type){
            Pizza pizza ;
            pizza=createPizza(type);
            return pizza;
      }
      abstract Pizza createPizza(String type);
}