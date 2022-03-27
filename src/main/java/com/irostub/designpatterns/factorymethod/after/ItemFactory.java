package com.irostub.designpatterns.factorymethod.after;

public interface ItemFactory {

    default Item buildItem(){
        return createItem();
    }

    Item createItem();
}
