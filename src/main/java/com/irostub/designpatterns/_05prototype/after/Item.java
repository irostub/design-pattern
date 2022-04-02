package com.irostub.designpatterns._05prototype.after;


import java.util.Objects;

public class Item implements Cloneable {
    private Extension extension;
    private String name;

    public Item(String name, Extension extension) {
        this.name = name;
        this.extension = extension;
    }

    @Override
    public Item clone() {
        Extension extension = new Extension(this.extension);
        return new Item(this.name, extension);
    }

    public Extension getExtension() {
        return extension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(extension, item.extension) && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extension, name);
    }
}
