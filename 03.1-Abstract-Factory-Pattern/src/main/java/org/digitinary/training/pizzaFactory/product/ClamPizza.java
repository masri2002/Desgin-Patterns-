package org.digitinary.training.pizzaFactory.product;

import org.digitinary.training.pizzaFactory.creator.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing"+name);
        dough=pizzaIngredientFactory.createDough();
        sauce= pizzaIngredientFactory.createSauce();
        cheese= pizzaIngredientFactory.createCheese();
        clam= pizzaIngredientFactory.createClam();
    }
}
