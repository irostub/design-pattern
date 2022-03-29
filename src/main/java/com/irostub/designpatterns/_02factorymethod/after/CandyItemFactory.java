package com.irostub.designpatterns._02factorymethod.after;

public class CandyItemFactory extends DefaultItemFactory{
    @Override
    public Item createItem() {
        return new Candy();
    }
}
