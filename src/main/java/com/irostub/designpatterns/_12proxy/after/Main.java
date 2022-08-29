package com.irostub.designpatterns._12proxy.after;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.run();
    }
}
