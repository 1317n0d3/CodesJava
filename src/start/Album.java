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

    public Album(String name, String author, List<Track> tracks) {
        this.name = name;
        this.author = author;
        this.tracks = List.copyOf(tracks);
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
