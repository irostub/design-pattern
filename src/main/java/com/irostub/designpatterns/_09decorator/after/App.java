package com.irostub.designpatterns._09decorator.after;

public class App {
    private final static boolean spamFilter = true;
    private final static boolean dotFilter = true;

    public static void main(String[] args) {

        CommentService commentService = new DefaultCommentService();

        if (spamFilter) {
            commentService = new SpamFilterCommendDecorator(commentService);
        }

        if (dotFilter) {
            commentService = new DotFilterCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.printComment("...hello comment.");
        client.printComment("http://irostub.kro.kr");
        client.printComment("hello world");
    }
}
