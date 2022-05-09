package com.irostub.designpatterns._09decorator.after;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void printComment(String comment) {
        commentService.addComment(comment);
    }
}
