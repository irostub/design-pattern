package com.irostub.designpatterns._07bridge.after.hero;

import com.irostub.designpatterns._07bridge.after.skin.Skin;

public class DefaultManabuHero implements Hero{
    private final Skin skin;

    private final String name = "manabu";

    public DefaultManabuHero(Skin skin) {
        this.skin = skin;
    }

    @Override
    public void move() {
        System.out.printf("%s %s hero is move\n", skin.getName(), name);
    }

    @Override
    public void q() {
        System.out.printf("%s %s hero skill Q\n", skin.getName(), name);
    }

    @Override
    public void w() {
        System.out.printf("%s %s hero skill W\n", skin.getName(), name);
    }

    @Override
    public void e() {
        System.out.printf("%s %s hero skill E\n", skin.getName(), name);
    }

    @Override
    public void r() {
        System.out.printf("%s %s hero skill R\n", skin.getName(), name);
    }
}
