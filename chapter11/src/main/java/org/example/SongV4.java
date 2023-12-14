package org.example;

public class SongV4 implements Comparable<SongV4> {
    private String title;
    private String artist;
    private int bpm;

    public SongV4(String title, String name, int bpm) {
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
        return title;
    }

    @Override
    public int compareTo(SongV4 o) {
        return this.title.compareTo(o.getTitle());
    }
}
