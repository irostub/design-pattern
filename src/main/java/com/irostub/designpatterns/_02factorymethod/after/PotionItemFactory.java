package com.irostub.designpatterns._02factorymethod.after;

public class PotionItemFactory extends DefaultItemFactory{
    @Override
    public Item createItem() {
        return new Potion();
    }
}
