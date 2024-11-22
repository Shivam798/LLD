package org.example.statepattern.states;

import org.example.statepattern.VendingMachine;

public class IdealState implements State {

    private final VendingMachine vendingMachine;

    public IdealState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted. Please select a product.");
        vendingMachine.setState(vendingMachine.getSelectProduct());
    }

    @Override
    public void selectProduct() {
        System.out.println("You need to insert money first.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("You need to insert money and select a product first.");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("No transaction to cancel.");
    }
}
