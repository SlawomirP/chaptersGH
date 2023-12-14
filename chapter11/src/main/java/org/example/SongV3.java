package org.example;

public class SongV3 implements Comparable<SongV3> {
    private String title;
    private String artist;
    private int bpm;

    public SongV3(String title, String name, int bpm) {
        this.title = title;
        this.artist = name;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title +"->" + bpm;
    }

    @Override
    public int compareTo(SongV3 o) {
        return this.title.compareTo(o.getTitle());
    }
}
