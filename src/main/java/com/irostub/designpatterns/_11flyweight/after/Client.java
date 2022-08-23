package com.irostub.designpatterns._11flyweight.after;

public class Client {
    public static void main(String[] args) {
        FontFlyweightBuilder builder = new FontFlyweightBuilder();
        Font font1 = builder.getFont("gothic:12");
        Font font2 = builder.getFont("gothic:13");
        Character c1 = new Character('h', "cyan", font1);
        Character c2 = new Character('e', "red", font1);
        Character c3 = new Character('l', "blue", font1);
        Character c4 = new Character('l', "white", font2);
        Character c5 = new Character('o', "black", font2);
    }
}
