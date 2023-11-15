public class SimpleStartupGame {

    //3 KROK TO STWORZENIE SAMEJ KLASY Z GRA UZYWAJACA OBIEKTU SIMPLEsTARTUP

    public static void main(String[] args) {

        int numOfGuesses= 0; // licznik prób

        GameHelper helper = new GameHelper(); // obiekt do pobierania danych od uzytkownika

        SimpleStartup theStartup = new SimpleStartup(); // obikt klasy startupa

        int randomNum = (int) (Math.random() * 5); // wylosowanie liczy od 0 - 0.99 - rzutowanie na int

        int [] locations = {randomNum, randomNum + 1, randomNum + 2}; // stworzenie tablicy

        theStartup.setLocationCells(locations);    // przypisanie jej do obiektu

        boolean isAlive = true; // warunek do petli, sprawdzenie stanu statku

        while(isAlive){

            int guess = helper.getUserInput("enter a number"); // pobranie wart od usera

            String result = theStartup.checkYourself(guess); // zwraca komunikat zaleznie od wart od usera

            numOfGuesses++; // dodaje kolejne podejscie do licznika

            if (result.equals("kill")) { // jezeli zwrocony rezultat to "kill"
                isAlive = false; // zmieniamy warunek petli
                System.out.println("You took " + numOfGuesses + " guesses"); // podsumowanie dla usera
            }
        }


    }
}
