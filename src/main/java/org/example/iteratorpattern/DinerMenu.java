package org.example.iteratorpattern;

public class DinerMenu {
    private final static int MAX_ITEMS = 6;
    private MenuItem[] items;
    private int numberOfItems =0;

    public DinerMenu(){
        items = new MenuItem[MAX_ITEMS];
        addItems("Vegetarian BLT", "Bacon, lettuce, tomato", true, 2.99);
        addItems("BLT", "Bacon, lettuce, tomato", false, 2.99);
    }

    public void addItems(String name,String desc, boolean vegetarian , double price){
        if (numberOfItems < MAX_ITEMS) {
            items[numberOfItems++] = new MenuItem(name, desc, vegetarian, price);
        }else{
            System.out.println("Menu is full");
        }
    }

    public Iterator createIterator(){
        return  new DinerMenuIterator(items);
    }
}
