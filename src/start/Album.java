package start;

import java.util.ArrayList;
import java.util.List;

public class Album {
    String name;
    String author;
    List <Track> tracks = new ArrayList<>();

    public Album(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
