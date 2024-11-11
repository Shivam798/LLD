package org.example.factorypattern;

import org.example.factorypattern.store.NYPizzaFactory;
import org.example.factorypattern.store.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory nyPizzaFactory = new NYPizzaFactory();
        nyPizzaFactory.orderPizza("veggie");


    }
}
