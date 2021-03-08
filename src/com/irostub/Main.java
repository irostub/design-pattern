package com.irostub;

import com.irostub.singleton.SingletonEagerInitialization;
import com.irostub.singleton.SingletonLazyInitialization;
import com.irostub.singleton.SingletonThreadSafe;

public class Main {

    public static void main(String[] args) {
        SingletonEagerInitialization singletonEagerInitializationInstance1 = SingletonEagerInitialization.getInstance();
        singletonEagerInitializationInstance1.setChecksum(1);
        SingletonEagerInitialization singletonEagerInitializationInstance2 = SingletonEagerInitialization.getInstance();
        if (singletonEagerInitializationInstance1.getChecksum() == singletonEagerInitializationInstance2.getChecksum()) {
            System.out.println("singletonEagerInitializationInstance1.getChecksum() = " + singletonEagerInitializationInstance1.getChecksum());
            System.out.println("singletonEagerInitializationInstance2.getChecksum() = " + singletonEagerInitializationInstance2.getChecksum())
            ;
            System.out.println("Singleton Eager Initialization success");
        }

        SingletonLazyInitialization singletonLazyInitializationInstance1 = SingletonLazyInitialization.getInstance();
        singletonLazyInitializationInstance1.setChecksum(2);
        SingletonLazyInitialization singletonLazyInitializationInstance2 = SingletonLazyInitialization.getInstance();
        if (singletonLazyInitializationInstance1.getChecksum() == singletonLazyInitializationInstance2.getChecksum()) {
            System.out.println("singletonLazyInitializationInstance1.getChecksum() = " + singletonLazyInitializationInstance1.getChecksum());
            System.out.println("singletonLazyInitializationInstance2.getChecksum() = " + singletonLazyInitializationInstance2.getChecksum());
            System.out.println("Singleton Lazy Initialization success");
        }


        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();
        new Thread(() -> {
            singletonThreadSafe1.setChecksum(2);
        });

        new Thread(() -> {
            singletonThreadSafe2.setChecksum(3);
        });
        if (singletonThreadSafe1.getChecksum() == singletonThreadSafe2.getChecksum()) {
            System.out.println("singletonThreadSafe Instance1.getChecksum() = " + singletonThreadSafe1.getChecksum());
            System.out.println("singletonThreadSafe Instance2.getChecksum() = " + singletonThreadSafe2.getChecksum());
            System.out.println("Singleton Thread Safe Initialization success");
        }
    }
}
