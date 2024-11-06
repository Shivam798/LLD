package org.example.decoratorpattern;

public class WhippedCream extends Topping{
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + Whipped Cream";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }
}
