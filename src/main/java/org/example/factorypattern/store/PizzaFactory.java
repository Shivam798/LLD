package org.example.factorypattern.store;

import org.example.factorypattern.pizzas.Pizza;

public abstract class PizzaFactory  {
    public void orderPizza(String pizzaType){
        Pizza pizza = makePizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.box();
    }
    public abstract Pizza makePizza(String pizzaType);
}
