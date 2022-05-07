package com.irostub.designpatterns._07bridge.before.hero;

public class BlackMasahiro implements Hero{
    @Override
    public void move() {
        System.out.println("Black Masahiro Move");
    }

    @Override
    public void q() {
        System.out.println("Black Masahiro Skill Q");
    }

    @Override
    public void w() {
        System.out.println("Black Masahiro Skill W");
    }

    @Override
    public void e() {
        System.out.println("Black Masahiro Skill E");
    }

    @Override
    public void r() {
        System.out.println("Black Masahiro Skill R");
    }
}
