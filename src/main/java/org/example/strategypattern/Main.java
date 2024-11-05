package org.example.strategypattern;

import org.example.strategypattern.strategies.CreditCardPayment;
import org.example.strategypattern.strategies.CryptoPayment;

public class Main {
    public static void main(String[] args) {
        PaymentProcessing paymentProcessing = new PaymentProcessing();
        paymentProcessing.setPaymentStrategy(new CreditCardPayment());
        paymentProcessing.execute(100.0);

        paymentProcessing.setPaymentStrategy(new CryptoPayment());
        paymentProcessing.execute(200.0);
    }
}
