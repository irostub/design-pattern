package com.irostub.designpatterns._10facade.after;

public class Config {
    private static Config config;

    private Config() {
    }

    public static Config getInstance() {
        if(config == null){
            synchronized (Config.class) {
                if (config == null) {
                    config = new Config();
                }
            }
        }
        return config;
    }

    private String host = "127.0.0.1";
    private String email = "iro@ooo.ooo";

    public MailSender mailSender() {
        return new ConsoleMailSender();
    }
}
