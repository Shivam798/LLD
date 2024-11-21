package org.example.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class PanCakeMenu {
    private List<MenuItem> items;

    public PanCakeMenu(){
        items= new ArrayList<>();
        addItem("Pancake Breakfast", "Pancakes with scrambled eggs", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs", false, 2.99);
    }

    public void addItem(String item,String desc,boolean vegetarian,double price){
        items.add(new MenuItem(item,desc,vegetarian,price));
    }

    public Iterator creatIterator(){
        return new PanCakeHouseIterator(items);
    }
}
