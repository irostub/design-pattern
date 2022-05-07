package com.irostub.designpatterns._08composite.after;

public class Portion implements Item {
    @Override
    public String getName() {
        return "portion";
    }

    @Override
    public int getPrice() {
        return 75;
    }
}
