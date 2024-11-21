package org.example.iteratorpattern;

public class Main {
    public static void main(String[] args) {
        PanCakeMenu panCakeMenu = new PanCakeMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(panCakeMenu,dinerMenu);
        waitress.printMenu();
    }
}
