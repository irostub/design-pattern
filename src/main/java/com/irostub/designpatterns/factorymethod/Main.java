package com.irostub.designpatterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        Item item = new PotionItemFactory().buildItem();

    }
}
