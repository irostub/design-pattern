package com.irostub.designpatterns.factorymethod;

public interface ItemFactory {

    default Item buildItem(){
        return createItem();
    }

    Item createItem();
}
