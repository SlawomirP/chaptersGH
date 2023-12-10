package org.example;

import java.util.Collections;
import java.util.List;

public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    //wyswietlanie listy
    public void go () {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);

        System.out.println("sortowanie naturalne");
        Collections.sort(songList);
        System.out.println(songList);
    }
}
