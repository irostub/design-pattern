package com.irostub.designpatterns._02factorymethod.before;

public class Main {
    public static void main(String[] args) {
        Item potion = ItemFactory.makeItem("potion", 50);
        Item candy = ItemFactory.makeItem("candy", 40);

        System.out.println(potion);
        System.out.println(candy);
    }
}
