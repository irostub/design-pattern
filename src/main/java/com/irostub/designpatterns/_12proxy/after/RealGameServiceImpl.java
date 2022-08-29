package com.irostub.designpatterns._12proxy.after;

public class RealGameServiceImpl implements GameService{
    int x = 0;

    @Override
    public void run() {
        for(int i = 0; i< 10000; i++)
            x++;

        System.out.println(x);
    }
}
