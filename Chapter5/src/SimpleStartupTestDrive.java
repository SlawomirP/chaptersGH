public class SimpleStartupTestDrive {
    public static void main(String[] args) {

        // 1 KROK - TO STWORZENIE TESTU SPRAWDZAJACEGO METODE SPRAWDZAJACA TRAFIENIA, TRZEBA ZROBIC OBIEKT KLASY
        // BO W NIM BEDZIE TABLICA I DLA NIEGO JEST METODA SPRAWDZAJĄCA

        SimpleStartup simpleStartup = new SimpleStartup();

        int [] locations = {2,3,4}; //przykladowy statek do zestrzelenia

        simpleStartup.setLocationCells(locations); // ustawienie setterem wartosci w tablicy w obiekcie

        int userGuess = 2; // wartosc od usera

        String result = simpleStartup.checkYourself(userGuess); // stworzenie stringa i przypisanie do niego wyniku
                                                                // metody sprawdzającej cos na podstawie wart od usera

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
