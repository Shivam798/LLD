package org.example.statepattern.states;

import org.example.statepattern.VendingMachine;

public class DispensingState implements State {

    private final VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Please wait, dispensing in progress.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Dispensing in progress. Cannot select another product.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Dispensing product...");
        vendingMachine.releaseProduct();
        if(vendingMachine.getProductCount()>0){
            vendingMachine.setState(vendingMachine.getIdealState());
        }else {
            System.out.println("Out of stock. Cannot accept new transactions.");
            vendingMachine.setState(vendingMachine.getOutOfStock());
        }
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Cannot cancel, dispensing in progress.");
    }
}
