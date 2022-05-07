package com.irostub.designpatterns._07bridge.after;

import com.irostub.designpatterns._07bridge.after.hero.DefaultManabuHero;
import com.irostub.designpatterns._07bridge.after.hero.Hero;
import com.irostub.designpatterns._07bridge.after.skin.BlackSkin;
import com.irostub.designpatterns._07bridge.after.skin.KDASkin;
import com.irostub.designpatterns._07bridge.after.skin.WhiteSkin;

public class App {
    public static void main(String[] args) {
        Hero blackManabu = new DefaultManabuHero(new BlackSkin());
        Hero whiteManabu = new DefaultManabuHero(new WhiteSkin());
        Hero KDAManabu = new DefaultManabuHero(new KDASkin());

        blackManabu.move();
        blackManabu.q();
        blackManabu.w();
        blackManabu.e();
        blackManabu.r();

        whiteManabu.move();
        whiteManabu.q();
        whiteManabu.w();
        whiteManabu.e();
        whiteManabu.r();

        KDAManabu.move();
        KDAManabu.q();
        KDAManabu.w();
        KDAManabu.e();
        KDAManabu.r();
    }
}
