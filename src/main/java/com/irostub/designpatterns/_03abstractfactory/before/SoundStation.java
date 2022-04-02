package com.irostub.designpatterns._03abstractfactory.before;

public class SoundStation {
    private Woofer woofer;
    private Speaker speaker;

    public void setWoofer(Woofer woofer) {
        this.woofer = woofer;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
