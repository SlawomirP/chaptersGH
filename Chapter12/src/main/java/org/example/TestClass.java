package org.example;

import java.util.List;
import java.util.Optional;
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

        boolean resultAnyMatch = songs.stream()
                .anyMatch(s -> s.getGenre().equals("R&B"));
        System.out.println(resultAnyMatch);

        boolean resultAllMatch = songs.stream()
                .allMatch(s -> s.getGenre().equals("R&B"));
        System.out.println(resultAllMatch);

        boolean resultNoneMatch = songs.stream()
                .noneMatch(s -> s.getGenre().equals("R&B"));
        System.out.println(resultNoneMatch);

        Optional<Song> resultFindFirst = songs.stream()
                .filter(s -> s.getYear() == 1995)
                .findFirst();
        System.out.println(resultFindFirst);

        Optional<Song> resultFindAny = songs.stream()
                .filter(s -> s.getTitle().equals("Hurt"))
                .findAny();
        System.out.println(resultFindAny);

        Optional<Integer> resultMaxYear = songs.stream()
                        .map(Song::getYear)
                                .max(Integer::compareTo);

        System.out.println(resultMaxYear);

        long result = songs.stream()
                .map(Song :: getArtist)
                .distinct()
                .count();
        System.out.println(result);

    }
}
