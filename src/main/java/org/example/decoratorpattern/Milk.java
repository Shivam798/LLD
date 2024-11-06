package org.example.decoratorpattern;

public class Milk extends Topping{

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" + Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.0;
    }
}
