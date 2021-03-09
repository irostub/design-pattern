package com.irostub;

import com.irostub.singleton.SingletonEagerInitialization;
import com.irostub.singleton.SingletonHolderInitialization;
import com.irostub.singleton.SingletonLazyInitialization;
import com.irostub.singleton.SingletonThreadSafe;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(SingletonEagerInitialization.getInstance() == SingletonEagerInitialization.getInstance());

        System.out.println(SingletonLazyInitialization.getInstance() == SingletonLazyInitialization.getInstance());

        System.out.println(SingletonThreadSafe.getInstance() == SingletonThreadSafe.getInstance());

        System.out.println(SingletonHolderInitialization.getInstance() == SingletonHolderInitialization.getInstance());
    }
}
