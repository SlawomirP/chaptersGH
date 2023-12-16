package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox8 {
    public static void main(String[] args) {

        new Jukebox8().go();


    }

    public void go () {
        List<SongV4> songList = MockSongs.getSongsV4(); // tworzymy liste song4 z nadpisanym equals i hascode
        System.out.println(songList);
        System.out.println();

//        // sortowanie po tytulach alfabetycznie
//        songList.sort((first, second) -> first.getTitle().compareTo(second.getTitle()));
//        System.out.println(songList);
//        System.out.println();

        Set<SongV4> songSet = new TreeSet<>(songList); //wrzucilismy tu nasza liste i to go przerobi na treeseta
        System.out.println(songSet);

        System.out.println("-----------------------");
        //tworzymy set i przerabiamy go na treeset z warunkiem
        Set<SongV4> songSet2 = new TreeSet<>((o1,o2) -> o1.getBpm() - o2.getBpm());
        songSet2.addAll(songSet); // do tego pustego treeseta wrzucamy wczesniejszy juz treeset - caly
        System.out.println(songSet2); // wyswietlamy - posortuje z warunkeim ustalonym wyzej







    }
}
