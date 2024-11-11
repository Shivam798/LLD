package org.example.factorypattern;

import org.example.factorypattern.pizzas.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza margherita = PizzaFactory.makePizza("margherita");
        margherita.prepare();
        margherita.bake();
        margherita.box();

        Pizza pepperoni = PizzaFactory.makePizza("pepperoni");
        pepperoni.prepare();
        pepperoni.bake();
        pepperoni.box();

        Pizza veggie = PizzaFactory.makePizza("veggie");
        veggie.prepare();
        veggie.bake();
        veggie.box();
    }
}
