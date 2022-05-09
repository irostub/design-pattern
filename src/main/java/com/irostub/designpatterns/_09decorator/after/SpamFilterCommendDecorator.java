package com.irostub.designpatterns._09decorator.after;

public class SpamFilterCommendDecorator extends CommentDecorator{

    public SpamFilterCommendDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if(!isSpam(comment)){
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.startsWith("http");
    }
}
