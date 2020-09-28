package start;

public class Track {
    String name;
    String author;
    Album album;

    public Track(String name) {
        this.name = name;
    }

    public Track(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Track(String name, Album album) {
        this.name = name;
        this.album = album;
    }

    public Track(String name, String author, Album album) {
        this.name = name;
        this.author = author;
        this.album = album;
    }

    @Override
    public String toString() {
        if (author != null)
            return name + ", Authors: " + album.author + ", " + author;
        else
            return name + ", Author: " + album.author;
    }
}
