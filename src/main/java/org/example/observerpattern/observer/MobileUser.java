package org.example.observerpattern.observer;

public class MobileUser implements Observer{

    private String appName;

    public MobileUser(String appName){
        this.appName=appName;
    }

    @Override
    public void update(double price) {
        System.out.println("Mobile User " + appName + " stock price = "+ price);
    }
}
