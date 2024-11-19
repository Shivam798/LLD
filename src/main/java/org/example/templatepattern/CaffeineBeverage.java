package org.example.templatepattern;

public abstract class CaffeineBeverage {

    public final void prepareRecipe(){
        boil();
        brew();
        pourInCup();
        if(customerWantCondiment()){
            addCondiments();
        }
    }

    // Common steps
    private void boil() {
        System.out.println("Boiling Water");
    }

    private void pourInCup() {
        System.out.println("Pouring in cup");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();

    //Hook
    protected boolean customerWantCondiment() {
        return true;
    }
}
