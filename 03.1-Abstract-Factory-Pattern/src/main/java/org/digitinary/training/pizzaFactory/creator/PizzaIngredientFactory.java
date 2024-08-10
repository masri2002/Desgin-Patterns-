package org.digitinary.training.pizzaFactory.creator;

import org.digitinary.training.pizzaFactory.product.*;

public interface PizzaIngredientFactory {
   public Dough createDough();
   public Sauce createSauce();
   public Cheese createCheese();
   public Veggies[] createVeggies();
   public Pepperoni createPepperoni();
   public Clams createClam();
}
