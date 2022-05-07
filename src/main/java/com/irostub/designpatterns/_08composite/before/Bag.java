package com.irostub.designpatterns._08composite.before;

import java.util.List;

public class Bag {
    private final List<Item> items;

    public Bag(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}
