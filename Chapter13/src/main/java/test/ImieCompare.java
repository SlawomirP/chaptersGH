package test;

import java.util.Comparator;

public class ImieCompare implements Comparator<Osoba> {

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.getImie().compareTo(o2.getImie());
    }
}
