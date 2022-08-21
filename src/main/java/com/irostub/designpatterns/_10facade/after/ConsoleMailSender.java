package com.irostub.designpatterns._10facade.after;

public class ConsoleMailSender implements MailSender {
    @Override
    public void sendMail(MailMessage mailMessage) {
        System.out.println(mailMessage.getFrom());
        System.out.println(mailMessage.getTo());
        System.out.println(mailMessage.getSubject());
    }
}
