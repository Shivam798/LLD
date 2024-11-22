package org.example.statepattern.states;

import org.example.statepattern.VendingMachine;

public class OutOfStock implements State{

    private final VendingMachine vendingMachine;

    public OutOfStock(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Machine is out of stock. Cannot accept money.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Machine is out of stock. Cannot select a product.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Machine is out of stock. Cannot dispense product.");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("No transaction to cancel.");
    }
}
