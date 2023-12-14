package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox7 {
    public static void main(String[] args) {

        new Jukebox7().go();


    }

    public void go () {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
        System.out.println();

        // sortowanie po tytulach alfabetycznie
        songList.sort((first, second) -> first.getTitle().compareTo(second.getTitle()));
        System.out.println(songList);
        System.out.println();

        Set<SongV3> songSet = new HashSet<>(songList); //wrzucilismy tu nasza liste i to go przerobi na seta
        System.out.println(songSet);






    }
}
