package com.irostub.designpatterns.factorymethod;

public class PotionItemFactory implements ItemFactory{
    @Override
    public Item createItem() {
        return new Item();
    }
}
