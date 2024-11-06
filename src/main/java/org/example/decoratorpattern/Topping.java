package org.example.decoratorpattern;

public abstract class Topping implements Coffee{

    protected Coffee coffee;

    public Topping(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
