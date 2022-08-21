package com.irostub.designpatterns._10facade.after;

public class ConsoleMail implements MailMessage {
    private String subject;
    private String to;
    private String from;
    private String text;

    public ConsoleMail(String subject, String to, String from) {
        this.subject = subject;
        this.to = to;
        this.from = from;
    }

    @Override
    public String getSubject() {
        return "[mail console] "+subject;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "ConsoleMail{" +
                "subject='" + subject + '\'' +
                ", to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
