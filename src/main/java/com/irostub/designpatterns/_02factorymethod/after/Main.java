package com.irostub.designpatterns._02factorymethod.after;

public class Main {
    public static void main(String[] args) {
        print(new CandyItemFactory());
        print(new PotionItemFactory());

        /*Item item1 = new CandyItemFactory().buildItem();
        Item item2 = new PotionItemFactory().buildItem();

        System.out.println(item1);
        System.out.println(item2);*/
    }
    public static void print(ItemFactory itemFactory) {
        System.out.println(itemFactory.buildItem());
    }
}
