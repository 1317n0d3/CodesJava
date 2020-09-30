package start;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    String head;
    String text;
    List <String> tags = new ArrayList<>();
    Comments comments;
    int rating;

    public Publication(String head, String text, Comments comments, int rating) {
        this.head = head;
        this.text = text;
        this.comments = comments;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "(" + rating + ") " + head + "\n\ntags: " + tags + "\n\n" + text + "\n\nComments:\n" + comments;
    }
}
