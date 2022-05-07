package com.irostub.designpatterns._08composite.after;

public class Sword implements Item {
    @Override
    public String getName() {
        return "sword";
    }

    @Override
    public int getPrice() {
        return 350;
    }
}
