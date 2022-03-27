package com.irostub.designpatterns.factorymethod.after;

public class PotionItemFactory implements ItemFactory{
    @Override
    public Item createItem() {
        return new Item();
    }
}
