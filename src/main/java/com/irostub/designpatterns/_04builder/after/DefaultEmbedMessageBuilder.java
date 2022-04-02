package com.irostub.designpatterns._04builder.after;

import java.time.LocalDateTime;

public class DefaultEmbedMessageBuilder implements EmbedMessageBuilder {
    private EmbedMessage embedMessage;

    @Override
    public EmbedMessageBuilder newInstance(){
        embedMessage = new EmbedMessage();
        return this;
    }

    @Override
    public EmbedMessageBuilder setTitle(String title){
        embedMessage.setTitle(title);
        return this;
    }

    @Override
    public EmbedMessageBuilder setAuthor(String author) {
        embedMessage.setAuthor(author);
        return this;
    }

    @Override
    public EmbedMessageBuilder setDescription(String description){
        embedMessage.setDesc(description);
        return this;
    }

    @Override
    public EmbedMessageBuilder setTail(String tail) {
        embedMessage.setTail(tail);
        return this;
    }

    @Override
    public EmbedMessageBuilder setAvatarUrl(String url) {
        embedMessage.setAvatarUrl(url);
        return this;
    }

    @Override
    public EmbedMessageBuilder setPublishDate(LocalDateTime publishDate){
        embedMessage.setCreateAt(publishDate);
        embedMessage.setUpdatedAt(publishDate);
        return this;
    }

    @Override
    public EmbedMessage build() {
        return this.embedMessage;
    }
}
