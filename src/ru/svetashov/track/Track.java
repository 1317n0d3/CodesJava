package ru.svetashov.track;

public class Track {
    String name;
    String author;
    private Album album;

    public Track(String name) {
        this.name = name;
    }

    public Track(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Track(String name, Album album) {
        this.name = name;
        album.tracks.add(this);
        this.album = new Album(album.name, album.author, album.tracks);
    }

    public Track(String name, String author, Album album) {
        this.name = name;
        this.author = author;
        album.tracks.add(this);
        this.album = album;
    }

    public void setAlbum(Album album) {
        album.tracks.add(this);
        this.album = album;
    }

    public Album getAlbum(){
        return album;
    }

    public void getTracks(){
        System.out.println(this.album.getTracks());
    }

    @Override
    public String toString() {
        if (author != null)
            return name + ", Authors: " + album.author + ", " + author;
        else
            return name + ", Author: " + album.author;
    }
}
