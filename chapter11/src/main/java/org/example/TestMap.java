package org.example;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler1", 420);
        scores.put("Skyler2", 420);
        scores.put("Skyler3", 420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
