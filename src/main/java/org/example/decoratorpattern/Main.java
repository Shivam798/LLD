package org.example.decoratorpattern;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new Milk(coffee);
        coffee = new WhippedCream(coffee);
        coffee = new WhippedCream(coffee);

        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.getCost());

        // Adding Whipped Cream to the same coffee
        coffee = new WhippedCream(coffee);
        System.out.println("Updated Description: " + coffee.getDescription());
        System.out.println("Updated Total Cost: $" + coffee.getCost());

    }
}
