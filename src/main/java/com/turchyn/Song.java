package com.turchyn;

public class Song {
    private String artist;
    private String trek;

    public Song(String artist, String trek) {
        this.artist = artist;
        this.trek = trek;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", trek='" + trek + '\'' +
                '}';
    }
}
