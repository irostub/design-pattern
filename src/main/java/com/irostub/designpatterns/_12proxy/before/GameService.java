package com.irostub.designpatterns._12proxy.before;

public class GameService {
    void run(){
        int x = 0;
        for(int i = 0; i < 10000; i++)
            x++;
        System.out.println(x);
    }
}
