package org.example.statepattern.states;

public interface State {
    void insertMoney();
    void selectProduct();
    void dispenseProduct();
    void cancelTransaction();
}
