package org.example;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.*;

public class CoffeOrder {
    public static void main(String[] args) {

        List<String> coffees = List.of("Cappuccino",
                "Americano", "Espresso", "Cortado", "Mocha",
                "Cappuccino", "Flat White", "Latte");
//        forEach(coffees);

        Runnable r = () -> System.out.println("Hi!");

        Consumer<String> c = s -> System.out.println(s);

    }
    static void forEach(List <String> list){
        for (String s : list) {
            System.out.println(s);
        }
    }

}
