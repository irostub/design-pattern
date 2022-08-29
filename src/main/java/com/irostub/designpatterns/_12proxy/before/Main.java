package com.irostub.designpatterns._12proxy.before;


public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        long t1 = System.currentTimeMillis();
        gameService.run();
        long t2 = System.currentTimeMillis();
        double result = (t2-t1)/1000f;
        System.out.println(result);
    }
}
