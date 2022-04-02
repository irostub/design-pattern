package com.irostub.designpatterns._04builder.before;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EmbedMessage embedMessage = new EmbedMessage();
        embedMessage.setTitle("Message Title");
        embedMessage.setAuthor("irostub");
        embedMessage.setAvatarUrl("http://irostub.kro.kr");
        embedMessage.setDesc("test message");
        embedMessage.setTail("tail message");

        LocalDateTime now = LocalDateTime.now();
        embedMessage.setCreateAt(now);
        embedMessage.setUpdatedAt(now);
        embedMessage.setDeletedAt(null);

        System.out.println(embedMessage);
    }
}
