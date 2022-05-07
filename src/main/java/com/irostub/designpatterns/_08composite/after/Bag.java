package com.irostub.designpatterns._08composite.after;

import java.util.List;

public class Bag implements Component {
    private final List<Component> components;

    public Bag(List<Component> items) {
        this.components = items;
    }

    @Override
    public String getName() {
        return "가방";
    }

    @Override
    public int getPrice() {
        return components.stream()
                .mapToInt(Component::getPrice)
                .sum();
    }
}
