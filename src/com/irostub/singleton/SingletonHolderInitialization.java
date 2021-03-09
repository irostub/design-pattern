package com.irostub.singleton;

public class SingletonHolderInitialization {
    private SingletonHolderInitialization() {
    }

    private static class SingletonHolder {
        private static final SingletonHolderInitialization instance = new SingletonHolderInitialization();
    }

    public static SingletonHolderInitialization getInstance() {
        return SingletonHolder.instance;
    }
}
