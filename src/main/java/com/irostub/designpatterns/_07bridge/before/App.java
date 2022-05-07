package com.irostub.designpatterns._07bridge.before;

import com.irostub.designpatterns._07bridge.before.hero.BlackManabu;
import com.irostub.designpatterns._07bridge.before.hero.BlackMasahiko;
import com.irostub.designpatterns._07bridge.before.hero.Hero;

public class App {
    public static void main(String[] args) {
        Hero blackManabu = new BlackManabu();
        Hero blackMasahiko = new BlackMasahiko();

        blackManabu.move();
        blackManabu.q();
        blackManabu.w();
        blackManabu.e();
        blackManabu.r();

        blackMasahiko.move();
        blackMasahiko.q();
        blackMasahiko.w();
        blackMasahiko.e();
        blackMasahiko.r();
    }
}
