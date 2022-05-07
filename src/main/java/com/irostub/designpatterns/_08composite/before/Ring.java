package com.irostub.designpatterns._08composite.before;

public class Ring implements Item{
    @Override
    public String getName() {
        return "ring";
    }

    @Override
    public int getPrice() {
        return 300;
    }
}
