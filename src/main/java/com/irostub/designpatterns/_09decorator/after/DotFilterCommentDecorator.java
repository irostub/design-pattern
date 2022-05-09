package com.irostub.designpatterns._09decorator.after;

public class DotFilterCommentDecorator extends CommentDecorator{
    public DotFilterCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replaceAll("\\.", "");
    }
}
