package com.irostub.designpatterns._02factorymethod.after;

public interface ItemFactory {

    default Item buildItem(){
        return createItem();
    }

    Item createItem();
}
