public class SimpleStartup {

    //2 KROK TO STWORZENIE KLASY KTOREJ OBIEKTU BEDZIEMY UZYWAC W GRZE

    private int[] locations;
    private int numOfHits = 0;

    public void setLocationCells(int[] locations) {
        this.locations = locations;
    }

    public String checkYourself(int userGuess) {
        String result = "miss"; // ten string bedzie zwracany - standardowo bedzie miss, w przypadku znalezienia w
        // tablicy wartosci zgodnej z ta ktora podal user zmieni sie na hit

        for (int cell : locations) { // przelatujemy przez tablice sprawdzajac czy w jakiejs komorce jest wartosc
            if (cell == userGuess) { // zgodna z ta od usera - jezeli tak result zmienia sie w "hit", dodajemy tez
                result = "hit";      // tą próbę do zliczacza prób udanych i konczymy breakiem
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locations.length) { // jezeli liczba udanych hitów bedzie równa dlugosci tablicy statku
            result = "kill";                    // tzn ze statek zostal zatopiony i rezultat zwrocony to kill
        }

        System.out.println(result); // wynik wyswietlany userowi

        return result;
    }
}
