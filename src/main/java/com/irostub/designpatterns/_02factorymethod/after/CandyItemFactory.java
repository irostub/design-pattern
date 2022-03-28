package com.irostub.designpatterns._02factorymethod.after;

public class CandyItemFactory implements ItemFactory{
    @Override
    public Item createItem() {
        return new Candy();
    }
}
