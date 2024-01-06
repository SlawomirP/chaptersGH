package test2;

public abstract class Przedmiot {
    private String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return this.nazwa;
    }
}
