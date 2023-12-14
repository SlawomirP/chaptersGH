package org.example;

import java.util.Collections;
import java.util.List;

public class Jukebox6 {
    public static void main(String[] args) {

        new Jukebox6().go();


    }

    public void go () {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
        System.out.println();

        // sortowanie po tytulach alfabetycznie
        songList.sort((first, second) -> first.getTitle().compareTo(second.getTitle()));
        System.out.println(songList);
        System.out.println();

        // sortowanie po artystach alfabetycznie
        songList.sort((first, second) -> first.getArtist().compareTo(second.getArtist()));
        System.out.println(songList);
//
//
//        // sortowanie po tytulach odwrotnie do alfabetycznego
//        songList.sort((first, second) -> second.getTitle().compareTo(first.getTitle()));
//        System.out.println(songList);
//
//        // sortowanie po bpm rosnaco
//        songList.sort((first, sec) -> first.getBpm() - sec.getBpm());
//        System.out.println(songList);
//
//        // sortowanie po bpm malejaco
//        songList.sort((first, sec) -> sec.getBpm() - first.getBpm());
//        System.out.println(songList);






    }
}
