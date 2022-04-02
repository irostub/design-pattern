package com.irostub.designpatterns._05prototype.after;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("p_up", new Extension(false, "eq"));
        Item clone = item.clone();
        System.out.println(item != clone);
        System.out.println(item.equals(clone));
        System.out.println(item.getClass() == clone.getClass());
        System.out.println(item.getExtension().equals(clone.getExtension()));
        System.out.println(item.getExtension() != clone.getExtension());
    }
}
