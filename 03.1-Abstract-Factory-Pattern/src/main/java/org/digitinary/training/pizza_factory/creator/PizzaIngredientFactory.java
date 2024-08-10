package org.digitinary.training.pizza_factory.creator;

import org.digitinary.training.pizza_factory.product.*;

public interface PizzaIngredientFactory {
   public Dough createDough();
   public Sauce createSauce();
   public Cheese createCheese();
   public Veggies[] createVeggies();
   public Pepperoni createPepperoni();
   public Clams createClam();
}
