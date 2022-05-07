package com.irostub.designpatterns._08composite.after;

import java.util.Arrays;

/**
 * 클라이언트 코드에서 너무 많은 부분을 알고있어야 하는 것이 단점
 */
public class App {
    public static void main(String[] args) {
        Component item1 = new Portion();
        Component item2 = new Sword();
        Component item3 = new Ring();
        Component item4 = new Boots();
        Bag bag = new Bag(Arrays.asList(item1,item2,item3,item4));

        printPrice(item1);
        printPrice(item2);
        printPrice(item3);
        printPrice(item4);
        printPrice(bag);
    }

    private static void printPrice(Component component) {
        System.out.printf("%s 가격 : %d\n",component.getName(), component.getPrice());
    }
}
