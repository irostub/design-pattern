package com.irostub.designpatterns._03abstractfactory.after;

public class Main {
    public static void main(String[] args) {
        SoundStationFactory ssf = new DefaultSoundStationFactory(new DefaultSoundStationPartFactory());
        SoundStation soundStation = ssf.create();

        System.out.println(soundStation);
    }
}
