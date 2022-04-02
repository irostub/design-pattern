package com.irostub.designpatterns._03abstractfactory.after;

public class SoundStation {
    private Woofer woofer;
    private Speaker speaker;

    @Override
    public String toString() {
        return "SoundStation{" +
                "woofer=" + woofer +
                ", speaker=" + speaker +
                '}';
    }

    public void setWoofer(Woofer woofer) {
        this.woofer = woofer;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
