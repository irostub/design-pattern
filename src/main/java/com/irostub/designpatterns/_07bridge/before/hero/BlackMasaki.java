package com.irostub.designpatterns._07bridge.before.hero;

public class BlackMasaki implements Hero{
    @Override
    public void move() {
        System.out.println("Black Masaki Move");
    }

    @Override
    public void q() {
        System.out.println("Black Masaki Skill Q");
    }

    @Override
    public void w() {
        System.out.println("Black Masaki Skill W");
    }

    @Override
    public void e() {
        System.out.println("Black Masaki Skill E");
    }

    @Override
    public void r() {
        System.out.println("Black Masaki Skill R");
    }
}
