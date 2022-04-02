package com.irostub.designpatterns._03abstractfactory.after;

public class DefaultSoundStationFactory implements SoundStationFactory{
    private SoundStationPartFactory soundStationPartFactory;

    public DefaultSoundStationFactory(SoundStationPartFactory soundStationPartFactory) {
        this.soundStationPartFactory = soundStationPartFactory;
    }

    @Override
    public SoundStation create() {
        SoundStation soundStation = new SoundStation();
        soundStation.setSpeaker(soundStationPartFactory.createSpeaker());
        soundStation.setWoofer(soundStationPartFactory.createWoofer());
        return soundStation;
    }
}
