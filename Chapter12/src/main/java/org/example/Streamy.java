package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamy {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

        // przyklad z posortowaniem i potem ograniczeniem ilosci elementow

        List<String> result = strings.stream()
//                .sorted()
                .skip(2)
                .limit(4)
                .collect(Collectors.toList());

        System.out.println(result);


    }
}
