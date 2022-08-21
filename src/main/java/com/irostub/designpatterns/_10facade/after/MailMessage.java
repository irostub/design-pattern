package com.irostub.designpatterns._10facade.after;

public interface MailMessage {
    String getSubject();
    String getTo();
    String getFrom();
    String getText();
}
