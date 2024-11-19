package org.example.templatepattern;

public class Coffee extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Coffee is steeping");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Milk");
    }

    @Override
    protected boolean customerWantCondiment(){
        return false;
    }
}
