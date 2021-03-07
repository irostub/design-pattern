package com.irostub;

public class Main {

    public static void main(String[] args) {
        SingletonEagerInitialization instance1 = SingletonEagerInitialization.getInstance();
        instance1.setChecksum(1);
        SingletonEagerInitialization instance2 = SingletonEagerInitialization.getInstance();
        if (instance1.getChecksum() == instance2.getChecksum()) {
            System.out.println("instance1.getChecksum() = " + instance1.getChecksum());
            System.out.println("instance2.getChecksum() = " + instance2.getChecksum());
            System.out.println("SingletonEagerInitialization success");
        }
    }

    public static void starter(int select) {

    }
}
