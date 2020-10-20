package ru.svetashov.publication;

import java.util.List;

public class Publication {
    final String head;
    String text;
    final List <String> tags;
    Comments comments;
    int rating;

    public Publication(String head, String text, Comments comments, int rating, List <String> tags) {
        this.head = head;
        this.text = text;
        this.comments = comments;
        this.rating = rating;
        this.tags = tags;
    }

    void canChange(){
        if (comments == null)
            System.out.println("You can change text");
        else
            System.out.println("You can not change parametres");
    }

    public void setText(String text) {
        if (comments != null)
            throw new IllegalArgumentException("Editing impossible");
        this.text = text;
    }

    public String getHead() {
        return head;
    }

    @Override
    public String toString() {
        return "(" + rating + ") " + head + "\n\ntags: " + tags + "\n\n" + text + "\n\nComments:\n" + comments;
    }
}
