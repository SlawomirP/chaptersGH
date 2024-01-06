package test2;

import java.util.ArrayList;

public abstract class Miejsce<T> {

    private ArrayList<T> listaElementow = new ArrayList<>();

    public ArrayList<T> pobierzListaElementow() {
        return listaElementow;
    }

    public void dodaj(T e) {
        listaElementow.add(e);
    }

    public T pobierzElementZListy(int index) {
        return listaElementow.get(index);
    }
}
