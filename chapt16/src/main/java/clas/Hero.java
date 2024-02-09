package clas;

import java.io.Serializable;
import java.util.Arrays;

public class Hero implements Serializable {
    private final int moc;
    private final String typ;
    private final String[] bronie;
    public Hero(int moc, String typ, String[] bronie) {
        this.moc = moc;
        this.typ = typ;
        this.bronie = bronie;
    }
    public int getMoc() {
        return moc;
    }
    public String getTyp() {
        return typ;
    }
    public String getBronie() {
        return Arrays.toString(bronie);
    }

}
