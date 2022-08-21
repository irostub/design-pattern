package com.irostub.designpatterns._10facade.after;

public class Client {
    public static void main(String[] args) {
        Config config = Config.getInstance();
        MailSender mailSender = config.mailSender();
        mailSender.sendMail(new ConsoleMail("iroiroiro", "lin@ooo.ooo", "iro@ooo.ooo"));
    }
}
