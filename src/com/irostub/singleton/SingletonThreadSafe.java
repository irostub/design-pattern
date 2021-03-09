package com.irostub.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe singletonThreadSafe;

    private SingletonThreadSafe() {
    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (singletonThreadSafe == null) {
            singletonThreadSafe = new SingletonThreadSafe();
        }
        return singletonThreadSafe;
    }
}
