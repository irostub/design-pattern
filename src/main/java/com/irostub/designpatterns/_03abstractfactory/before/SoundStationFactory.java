package com.irostub.designpatterns._03abstractfactory.before;

public class SoundStationFactory {
    public SoundStation create(){
        SoundStation soundStation = new SoundStation();
        soundStation.setWoofer(new Woofer());
        soundStation.setSpeaker(new Speaker());
        return soundStation;
    }
}
