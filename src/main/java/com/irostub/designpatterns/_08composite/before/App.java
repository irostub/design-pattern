package com.irostub.designpatterns._08composite.before;

import java.util.Arrays;

/**
 * 클라이언트 코드에서 너무 많은 부분을 알고있어야 하는 것이 단점
 */
public class App {
    public static void main(String[] args) {
        Item item1 = new Portion();
        Item item2 = new Sword();
        Item item3 = new Ring();
        Item item4 = new Boots();
        Bag bag = new Bag(Arrays.asList(item1,item2,item3,item4));

        printPrice(item1);
        printPrice(item2);
        printPrice(item3);
        printPrice(item4);

        printPrice(bag);
    }

    private static void printPrice (Item item) {
        System.out.printf("가격 : %d", item.getPrice());
    }

    private static void printPrice(Bag bag) {
        int allPrice = bag.getItems().stream()
                .mapToInt(Item::getPrice)
                .sum();
        System.out.printf("가격 : %d", allPrice);
    }
}
