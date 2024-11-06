package org.example.observerpattern.subject;

import org.example.observerpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(price);
        }
    }
}
