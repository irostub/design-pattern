package com.irostub.designpatterns._05prototype.after;

public class Extension {
    private boolean spawn;
    private String serise;

    public Extension(boolean spawn, String serise) {
        this.spawn = spawn;
        this.serise = serise;
    }

    public Extension(Extension extension) {
        this.serise = extension.serise;
        this.spawn = extension.spawn;
    }
}
