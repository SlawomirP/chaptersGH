package test;

import java.util.Comparator;

public class WiekCompare implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.getWiek() - o2.getWiek();
    }
}
