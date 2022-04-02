package com.irostub.designpatterns._04builder.after;

import java.time.LocalDateTime;

public interface EmbedMessageBuilder {
    EmbedMessageBuilder newInstance();
    EmbedMessageBuilder setTitle(String title);
    EmbedMessageBuilder setAuthor(String author);
    EmbedMessageBuilder setDescription(String description);
    EmbedMessageBuilder setTail(String tail);
    EmbedMessageBuilder setAvatarUrl(String url);
    EmbedMessageBuilder setPublishDate(LocalDateTime publishDate);
    EmbedMessage build();
}
