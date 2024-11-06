package org.example.observerpattern.subject;

import org.example.observerpattern.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
