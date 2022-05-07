package com.irostub.designpatterns._07bridge.before.hero;

public class BlackManabu implements Hero{
    @Override
    public void move() {
        System.out.println("Black Manabu Move");
    }

    @Override
    public void q() {
        System.out.println("Black Manabu Skill Q");
    }

    @Override
    public void w() {
        System.out.println("Black Manabu Skill W");
    }

    @Override
    public void e() {
        System.out.println("Black Manabu Skill E");
    }

    @Override
    public void r() {
        System.out.println("Black Manabu Skill R");
    }
}
