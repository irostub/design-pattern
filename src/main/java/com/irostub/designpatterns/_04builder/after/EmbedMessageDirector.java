package com.irostub.designpatterns._04builder.after;

public class EmbedMessageDirector {
    private final EmbedMessageBuilder embedMessageBuilder;

    public EmbedMessageDirector(EmbedMessageBuilder embedMessageBuilder) {
        this.embedMessageBuilder = embedMessageBuilder;
    }

    public EmbedMessage helloEmbedMessage(){
        return embedMessageBuilder.newInstance()
                .setTitle("안녕하세요. 초기 메세지입니다")
                .setTail("안녕하세요. 꼬리말입니다.")
                .build();
    }
}
