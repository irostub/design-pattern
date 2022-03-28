package com.irostub.designpatterns._02factorymethod.before;

public class ItemFactory {
    public static Item makeItem(String name, Integer quantity){
        return new Item(name, quantity);
    }
}
