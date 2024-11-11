package org.example.factorypattern.store;

import org.example.factorypattern.pizzas.MargheritaPizza;
import org.example.factorypattern.pizzas.PepperoniPizza;
import org.example.factorypattern.pizzas.Pizza;
import org.example.factorypattern.pizzas.VeggiePizza;

public class NYPizzaFactory extends PizzaFactory{
    @Override
    public Pizza makePizza(String pizzaType) {
        return switch (pizzaType){
            case "veggie" -> new VeggiePizza();
            case "margherita" -> new MargheritaPizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> throw new IllegalStateException("Unexpected value: " + pizzaType);
        };
    }
}
