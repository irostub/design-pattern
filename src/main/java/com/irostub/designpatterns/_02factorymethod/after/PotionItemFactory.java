package com.irostub.designpatterns._02factorymethod.after;

public class PotionItemFactory implements ItemFactory{
    @Override
    public Item createItem() {
        return new Potion();
    }
}
