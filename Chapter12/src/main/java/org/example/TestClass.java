package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        Songs songs = new Songs();

        List<Song> louList = songs.getSongs();

        // z listy wybierzemy tylko piosenki z typu rock
        List<Song> rockSongs = louList.stream()
                .filter(s -> s.getGenre().equals("Rock"))
                .collect(Collectors.toList());

        System.out.println(rockSongs);
    }
}
