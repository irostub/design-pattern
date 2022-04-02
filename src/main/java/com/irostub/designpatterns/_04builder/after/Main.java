package com.irostub.designpatterns._04builder.after;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EmbedMessageBuilder builder = new DefaultEmbedMessageBuilder();
        EmbedMessage embedMessage = builder.newInstance()
                .setTitle("Message Title")
                .setAuthor("irostub")
                .setAvatarUrl("http://irostub.kro.kr")
                .setDescription("test message")
                .setTail("tail message")
                .setPublishDate(LocalDateTime.now())
                .build();
        System.out.println(embedMessage);

        EmbedMessageDirector director = new EmbedMessageDirector(builder);
        EmbedMessage helloEmbedMessage = director.helloEmbedMessage();
        System.out.println(helloEmbedMessage);
    }
}
