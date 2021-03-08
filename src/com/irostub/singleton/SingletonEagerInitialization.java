package com.irostub.singleton;

public class SingletonEagerInitialization {
    private static SingletonEagerInitialization singletonEagerInitialization = new SingletonEagerInitialization();
    private int checksum;

    private SingletonEagerInitialization() {
    }

    public static SingletonEagerInitialization getInstance() {
        return singletonEagerInitialization;
    }

    public int getChecksum() {
        return checksum;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }
}
