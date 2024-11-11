package org.example.factorypattern.pizzas;

public class PepperoniPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing PepperoniPizza Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking PepperoniPizza Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing PepperoniPizza Pizza");
    }
}
