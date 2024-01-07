package test2;

public class Testowa {

    public static void main(String[] args) {
        ZbiorRzeczy zbiorRzeczy = new ZbiorRzeczy();

        zbiorRzeczy.pobierzElementZListy(0).setNazwa("nowa nazwa dla myszki");
        zbiorRzeczy.pobierzElementZListy(0).getNazwa();
        System.out.println(zbiorRzeczy.pobierzElementZListy(0).getNazwa());


    }
}
