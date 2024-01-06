package test2;

public abstract class Jedzenie {
    private String nazwa;
    private boolean czyAktywny;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String toString() {
        return this.nazwa;
    }

}
