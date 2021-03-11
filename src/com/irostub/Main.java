package com.irostub;

import com.irostub.singleton.SingletonEagerInitialization;
import com.irostub.singleton.SingletonHolderInitialization;
import com.irostub.singleton.SingletonLazyInitialization;
import com.irostub.singleton.SingletonThreadSafe;
import com.irostub.strategy.tabs.*;

public class Main {
    public static void main(String[] args) {
        //Singleton(싱글턴) Pattern Test
        System.out.println(SingletonEagerInitialization.getInstance() == SingletonEagerInitialization.getInstance());
        System.out.println(SingletonLazyInitialization.getInstance() == SingletonLazyInitialization.getInstance());
        System.out.println(SingletonThreadSafe.getInstance() == SingletonThreadSafe.getInstance());
        System.out.println(SingletonHolderInitialization.getInstance() == SingletonHolderInitialization.getInstance());

        //Strategy(전략) Pattern Test
        Tab tab = new Tab();
        tab.onClick();
        tab.setStrategyTab(new TabShop());
        tab.onClick();
        tab.setStrategyTab(new TabMail());
        tab.onClick();
        tab.setStrategyTab(new TabCafe());
        tab.onClick();
    }
}
