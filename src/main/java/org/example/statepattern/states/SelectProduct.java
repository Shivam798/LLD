package org.example.statepattern.states;

import org.example.statepattern.VendingMachine;

public class SelectProduct implements State{

    private final VendingMachine vendingMachine;

    public SelectProduct(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money already inserted. Please select a product.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected. Dispensing the product...");
        vendingMachine.setState(vendingMachine.getDispensingState());
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select a product first.");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Transaction cancelled. Returning money...");
        vendingMachine.setState(vendingMachine.getIdealState());
    }
}
