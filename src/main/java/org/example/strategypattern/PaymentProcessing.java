package org.example.strategypattern;

import org.example.strategypattern.strategies.PaymentStrategy;

//Context
public class PaymentProcessing {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void execute(double amount){
        paymentStrategy.processPayment(amount);
    }

}
