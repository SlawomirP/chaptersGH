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

    @Override
    public boolean equals(Object song) { // podany obiekt
        SongV4 other = (SongV4) song; // rzutujemy na song
        return title.equals(other.getTitle()); // kryterium to tytuł
    }

    @Override
    public int hashCode() { // zwracamy dla tytułu
        return title.hashCode();
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
        return title + " " + bpm;
    }

    @Override
    public int compareTo(SongV4 o) {
        return this.title.compareTo(o.getTitle());
    }
}
