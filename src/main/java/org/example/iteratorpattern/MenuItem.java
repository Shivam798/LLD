package org.example.iteratorpattern;

public class MenuItem {

    private String name;
    private String desc;
    private boolean vegetarian;
    private double price;

    public MenuItem(String desc, String name, boolean vegetarian, double price) {
        this.desc = desc;
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getDesc() {
        return desc;
    }
}
