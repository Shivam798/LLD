package org.example.observerpattern.observer;

public class WebUser implements Observer{

    private String name;

    public WebUser(String name){
        this.name=name;
    }

    @Override
    public void update(double price) {
        System.out.println("Web User "+ name +" stock price = "+ price);
    }
}
