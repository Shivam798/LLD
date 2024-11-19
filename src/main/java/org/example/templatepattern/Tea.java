package org.example.templatepattern;

public class Tea extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Tea is steeping");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
