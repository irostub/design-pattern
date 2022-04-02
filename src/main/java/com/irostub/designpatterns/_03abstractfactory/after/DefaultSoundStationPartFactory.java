package com.irostub.designpatterns._03abstractfactory.after;

public class DefaultSoundStationPartFactory implements SoundStationPartFactory{
    @Override
    public Speaker createSpeaker() {
        return new GoldSpeaker();
    }

    @Override
    public Woofer createWoofer() {
        return new GoldWoofer();
    }
}
