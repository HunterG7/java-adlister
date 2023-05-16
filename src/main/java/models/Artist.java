package models;

import java.io.Serializable;

public class Artist implements Serializable {
    private long id;
    private String artist;
    private String songName;
    private int release_date;
    private int sales;
    private String genre;

    // constructors
    public Artist() {}

    public Artist(long id, String artist, String songName, int release_date, int sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.songName = songName;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }
}