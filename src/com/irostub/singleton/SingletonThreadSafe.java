package com.irostub.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe singletonThreadSafe;
    private int checksum;

    private SingletonThreadSafe() {
    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (singletonThreadSafe == null) {
            singletonThreadSafe = new SingletonThreadSafe();
        }
        return singletonThreadSafe;
    }

    public int getChecksum() {
        return checksum;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }
}
