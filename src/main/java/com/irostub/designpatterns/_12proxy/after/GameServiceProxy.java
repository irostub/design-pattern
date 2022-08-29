package com.irostub.designpatterns._12proxy.after;

public class GameServiceProxy implements GameService{
    GameService gameService;

    private void init() {
        if (gameService == null) {
            gameService = new RealGameServiceImpl();
        }
    }

    @Override
    public void run() {
        init();

        long t1 = System.currentTimeMillis();
        gameService.run();
        long t2 = System.currentTimeMillis();
        double result = (t2-t1)/1000f;
        System.out.println(result);
    }
}
