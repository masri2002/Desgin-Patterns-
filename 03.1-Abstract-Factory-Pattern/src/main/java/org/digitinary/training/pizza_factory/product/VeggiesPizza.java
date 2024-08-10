package org.digitinary.training.pizza_factory.product;

import org.digitinary.training.pizza_factory.creator.PizzaIngredientFactory;

public class VeggiesPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiesPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing "+name);
        dough=pizzaIngredientFactory.createDough();
        sauce= pizzaIngredientFactory.createSauce();
        cheese= pizzaIngredientFactory.createCheese();
        veggies= pizzaIngredientFactory.createVeggies();
    }
}
