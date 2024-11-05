package org.example.strategypattern.strategies;

public class CryptoPayment implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing crypto payment of " + amount);
    }
}
