package org.example.statepattern;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(3);
        vendingMachine.insertMoney();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();
        System.out.println("===================\n");

        vendingMachine.insertMoney();
        vendingMachine.cancelProduct();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();
        System.out.println("===================\n");

        vendingMachine.insertMoney();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();

        System.out.println("===================\n");
        vendingMachine.insertMoney();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();
        System.out.println("===================\n");
    }
}
