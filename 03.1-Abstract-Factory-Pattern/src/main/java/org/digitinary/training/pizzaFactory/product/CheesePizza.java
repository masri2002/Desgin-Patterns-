package org.digitinary.training.pizzaFactory.product;

import org.digitinary.training.pizzaFactory.creator.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;

    }

    @Override
    public void prepare() {
        System.out.println("preparing "+name);
        dough= pizzaIngredientFactory.createDough();
        sauce= pizzaIngredientFactory.createSauce();
        cheese=pizzaIngredientFactory.createCheese();
    }
}
