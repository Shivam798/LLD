package org.example.factorypattern;

import org.example.factorypattern.pizzas.MargheritaPizza;
import org.example.factorypattern.pizzas.PepperoniPizza;
import org.example.factorypattern.pizzas.Pizza;
import org.example.factorypattern.pizzas.VeggiePizza;

public class PizzaFactory  {
    public static Pizza makePizza(String pizzaType){
        return switch (pizzaType) {
            case "margherita" -> new MargheritaPizza();
            case "veggie" -> new VeggiePizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> throw new IllegalArgumentException("Unknown pizza type = " + pizzaType);
        };
    }
}
