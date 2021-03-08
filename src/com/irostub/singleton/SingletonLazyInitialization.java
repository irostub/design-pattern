package com.irostub.singleton;

public class SingletonLazyInitialization {
    private static SingletonLazyInitialization singletonLazyInitialization;
    private int checksum;

    private SingletonLazyInitialization() {
    }

    public static SingletonLazyInitialization getInstance() {
        if (singletonLazyInitialization == null) {
            singletonLazyInitialization = new SingletonLazyInitialization();
        }
        return singletonLazyInitialization;
    }

    public int getChecksum() {
        return checksum;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }
}
