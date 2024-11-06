package org.example.observerpattern;

import org.example.observerpattern.observer.MobileUser;
import org.example.observerpattern.observer.WebUser;
import org.example.observerpattern.subject.Stock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        WebUser user1 = new WebUser("Alice");
        MobileUser mUser = new MobileUser("Zerotha");

        stock.registerObserver(user1);
        stock.registerObserver(mUser);

        stock.setPrice(100.0);
        stock.setPrice(120.0);
        stock.removeObserver(user1);

        stock.setPrice(130.0);
    }
}
