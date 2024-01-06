package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestKolekcji {
    public static void main(String[] args) {

        List<Osoba> listaOsob = new ArrayList<>();

        listaOsob.add(new Osoba("Cezary", "Srodek", 5));
        listaOsob.add(new Osoba("Adam", "Lewy", 24));
        listaOsob.add(new Osoba("Bartek", "Prawy", 18));
        listaOsob.add(new Osoba("Jarek", "Czy", 35));

        System.out.println(listaOsob);

        ImieCompare imieCompare = new ImieCompare();
        listaOsob.sort((o1, o2) -> o1.getImie().compareTo(o2.getImie()));
        System.out.println(listaOsob);

        NazwiskoCompare nazwiskoCompare = new NazwiskoCompare();
        listaOsob.sort((o1, o2) -> o1.getNazwisko().compareTo(o2.getNazwisko()));
        System.out.println(listaOsob);

        WiekCompare wiekCompare = new WiekCompare();
        listaOsob.sort((o1, o2) -> o1.getWiek()- o2.getWiek());
        System.out.println(listaOsob);

    }
}
