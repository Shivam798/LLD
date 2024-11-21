package org.example.iteratorpattern;

public class Waitress {

    private PanCakeMenu panCakeMenu;
    private DinerMenu dinerMenu;

    public Waitress(PanCakeMenu panCakeMenu, DinerMenu dinerMenu) {
        this.panCakeMenu = panCakeMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        System.out.println("MENU\n----\nBREAKFAST");
        printer(panCakeMenu.creatIterator());
        System.out.println("\nLUNCH");
        printer(dinerMenu.createIterator());
    }

    public void printer(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.printf("%s, $%.2f -- %s --> %s\n", item.getName(), item.getPrice(), item.getDesc(),item.isVegetarian());
        }
    }
}
