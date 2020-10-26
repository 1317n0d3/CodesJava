package ru.svetashov.track;

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
        this.tracks = tracks;
    }

    public void addTrack(Track track){
        tracks.add(track);
    }

    public List<Track> getTracks(){
        return tracks;
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
