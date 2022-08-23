package com.irostub.designpatterns._11flyweight.before;

public class Client {
    public static void main(String[] args) {
        Character c1 = new Character('h', "irostub", "Gothic", 12);
        Character c2 = new Character('e', "irostub", "Gothic", 12);
        Character c3 = new Character('l', "irostub", "Gothic", 12);
        Character c4 = new Character('l', "irostub", "Gothic", 12);
        Character c5 = new Character('o', "irostub", "Gothic", 12);
    }
}
