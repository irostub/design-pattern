package com.irostub.designpatterns._03abstractfactory.after;

public interface SoundStationPartFactory{
    Speaker createSpeaker();
    Woofer createWoofer();
}
