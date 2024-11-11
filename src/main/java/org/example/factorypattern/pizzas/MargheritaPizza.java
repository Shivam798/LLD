package org.example.factorypattern.pizzas;

public class MargheritaPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Margherita Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Margherita Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Margherita Pizza");
    }
}
