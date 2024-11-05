package org.example.strategypattern.strategies;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}