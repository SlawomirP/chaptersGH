package org.example;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics1 {
    public static void main(String[] args) {

        List<Object> test = new ArrayList<>();

//        new TestGenerics1().takeObjects(test);

        List<Dog> dogs = new ArrayList<>();
        new TestGenerics1().takeDogs(dogs);
    }


    private void takeDogs(List<Dog> dogs) {
        for (Dog d : dogs) {
            System.out.println(d);
        }
    }
    private void takeAnimals(List<Animal> animals) {
        for (Animal d : animals) {
            System.out.println(d);
        }
    }


    private void takeSomeAnimals(List<? extends Animal> animals) {
        for (Animal d : animals) {
            System.out.println(d);
        }
    }

    private void takeObjects(ArrayList<Object> objects) {
        for (Object d : objects) {
            System.out.println(d);
        }
    }


    private static <T extends Animal> void takeAnimals2(List<T> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}
