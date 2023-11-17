package BonusLists;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        // jest to lista tablicowa - przechowywane sa tu obiekty okreslonego typu
        // nie trzeba okreslac z góry rozmiaru listy
        // lista automatycznie zwieksza swoj rozmiar

        ArrayList<Double> list1 = new ArrayList<>(); // typy obiektowe
        list1.add(2.2);

        list1.add(3.2);
        list1.add(4.2);

        System.out.println(list1); // wystarczy tak wpisac i zostana wypisane elementy arraylisty

        System.out.println(list1.get(0) + list1.get(1)); // get <- pobranie elementu z listy

        ArrayList<Double> list = new ArrayList<>();
        System.out.println(list.size()); // pobranie wielkosci listy size()

        for (int i = 0; i < 100; i++) {
            list.add((double) i); // int zostanie zmieniony na double
        }

        System.out.println(list.size());
        System.out.println(list.get(50));

        list.remove(2); // jezeli usuniemy obiekt z pod indexu to nie pozostanie dziura w liscie
                                // elemnty zostaną zsuniete do kupy
        System.out.println(list);

        list.remove(5.0); // usuniecie obiektu spowoduje powstanie dziury w liscie
        System.out.println(list);

        list.clear(); // czyszczenie listy

        /////////////////////////////////////////////////
        // LinkedList - dodawanie obiektow, pobieranie po indexach
        //od ArrayListy rozni sie struktura wewnetrzna,
        // pierwszy obiekt bedzie opakowany w biekt "wezeł"
        // drugi obiekt bedzie w kolejnym wężle
        // kazdy kolejny obiekt jest opakowany w taki wezel i on "wie" co jest za nim i przed nim
        // powoduje to kiepska wydajnosc
        // jedno co jest szybsze to wstawienie czegos na poczatek lub na koniec w array liscie to trzeba zrobic miejsce np na poczatku
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(2.2);
        linkedList.add(3.2);
        linkedList.add(4.2);

        // warto w listach korzystac z polimorfizmu/////////////////////

        LinkedList<Double> l1 = new LinkedList<>();
        ArrayList<Double> a1= new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            l1.add((double) i);
            a1.add((double) i);
        }
        // wyswietlenie elementow jeden pod drugim

//        private static void showList (List<Double> list) {
//            for (Double e: list) {
//                System.out.println(e);
//            }
//        }
        // warto deklarowac listy jako List<Double> list = new ArrayList<> albo LinkedList<>

        ////////////////////////////////////////////////////////////////////////
        // deklaracaja listy jeseli znamy rozmiar naszej tablicy
        // tworzac liste w ten sposob powoduje ze ta lista juz jest niemodyfikowalna
//        Integer [] ints = {5,10,15};
//        // przekształcenie w liste
//        List<Integer> list2 = Arrays.asList(ints);

        List<Integer> lst = List.of(5,10,15); // List.of(...)

        ////////////////////////////////////////
        List<String> table = new ArrayList<>();
        table.add("qwe");
        table.add("asd");
        table.add("zxc");
        table.add("qaz");
        table.add("wsx");
        table.forEach(System.out::println);
        System.out.println("-----------");

        table.remove("wsx");
        table.remove(0);
        table.forEach(System.out::println);

        System.out.println("------------------");
        List<String> t2 = new ArrayList<>();
        t2.add("123");
        t2.add("456");
        t2.add("qwe");
        t2.add("wsx");
        t2.forEach(System.out::println);


        System.out.println("+++++++++++");
        table.addAll(t2);
        table.forEach(System.out::println);

        System.out.println("+++++++++++");
        table.remove(4);
        table.forEach(System.out::println);

        System.out.println(table.contains("123"));
        System.out.println(table.contains("abc"));

        System.out.println(table.isEmpty());
        System.out.println(table.size());

        Collections.sort(table);
        table.forEach(System.out::println);

        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        t2.clear();
        t2.add("1");
        t2.add("2");
        t2.add("3");
        t2.add("4");
        t2.forEach(System.out::println);
        System.out.println("index 3 is: " + t2.indexOf("3"));
        System.out.println("object at index 0 is: " + t2.get(0));

        String [] myList = new String[2];
        myList[0] = "who";











    }

    private static void showList (List<Double> list) {
        for (Double e: list) {
            System.out.println(e);
        }
    }
}
