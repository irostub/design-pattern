package com.irostub.designpatterns._02factorymethod.after;

public class Item {
    private String name;
    private Integer quantity;

    public Item(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
