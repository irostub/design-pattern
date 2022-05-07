package com.irostub.designpatterns._07bridge.before.hero;

public class BlackMasahiko implements Hero{
    @Override
    public void move() {
        System.out.println("Black Masahiko Move");
    }

    @Override
    public void q() {
        System.out.println("Black Masahiko Skill Q");
    }

    @Override
    public void w() {
        System.out.println("Black Masahiko Skill W");
    }

    @Override
    public void e() {
        System.out.println("Black Masahiko Skill E");
    }

    @Override
    public void r() {
        System.out.println("Black Masahiko Skill R");
    }
}
