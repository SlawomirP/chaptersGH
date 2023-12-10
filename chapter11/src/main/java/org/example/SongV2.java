package org.example;

public class SongV2 {
    private String title;
    private String name;
    private int bpm;

    public SongV2(String title, String name, int bpm) {
        this.title = title;
        this.name = name;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }
}
