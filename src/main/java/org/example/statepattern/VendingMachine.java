package org.example.statepattern;

import org.example.statepattern.states.*;

public class VendingMachine {

    private IdealState idealState;
    private SelectProduct selectProduct;
    private DispensingState dispensingState;
    private OutOfStock outOfStock;

    private State currentState;
    private int productCount;

    public VendingMachine (int productCount){
        this.productCount=productCount;
        idealState = new IdealState(this);
        selectProduct = new SelectProduct(this);
        dispensingState = new DispensingState(this);
        outOfStock = new OutOfStock(this);

        if(productCount>0){
            currentState=idealState;
        }else {
            currentState = outOfStock;
        }
    }

    public void insertMoney(){
        currentState.insertMoney();
    }

    public void selectProduct(){
        currentState.selectProduct();
    }

    public void dispenseProduct(){
        currentState.dispenseProduct();
    }

    public void cancelProduct(){
        currentState.cancelTransaction();
    }

    public void setState(State state){
        this.currentState=state;
    }

    public State getIdealState() {
        return idealState;
    }

    public State getSelectProduct() {
        return selectProduct;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    public State getOutOfStock() {
        return outOfStock;
    }

    public int getProductCount() {
        return productCount;
    }

    public void releaseProduct(){
        if(productCount>0){
            System.out.println("A product is released.");
            productCount--;
        }
    }

}
