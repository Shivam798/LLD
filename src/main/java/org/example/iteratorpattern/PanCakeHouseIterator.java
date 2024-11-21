package org.example.iteratorpattern;

import java.util.List;

public class PanCakeHouseIterator implements Iterator {

    private List<MenuItem> items;
    int position =0;

    public PanCakeHouseIterator(List<MenuItem> items){
        this.items=items;
    }


    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}
