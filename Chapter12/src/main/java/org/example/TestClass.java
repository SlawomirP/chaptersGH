package org.example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        Songs mockSongs = new Songs();

        List<Song> songs = mockSongs.getSongs();

        // z listy wybierzemy tylko piosenki z typu rock
        List<Song> rockSongs = songs.stream()
                .filter(s -> s.getGenre().toLowerCase().contains("rock"))
                .collect(Collectors.toList());

//        System.out.println(rockSongs);

        // z listy wybrane zostana tylko piosenki Beatlesów
        List<Song> firstH = songs.stream()
                .filter(s -> s.getYear()>1995)
                .collect(Collectors.toList());

//        System.out.println(firstH);

        // zamiana pierwotnych elementow w liscie na inne (zawarte w obiekcie)
        // plus usuniecie duplikatów z listy
        List<String> onlyGenre = songs.stream()
                .map(s -> s.getGenre())
                .distinct()
                .collect(Collectors.toUnmodifiableList());

        System.out.println(onlyGenre);

        Set<String> genres = songs.stream()
                .map(song -> song.getGenre())
                .collect(Collectors.toUnmodifiableSet());

    }
}
