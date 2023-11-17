import java.util.ArrayList;

public class Startup {

    private String name;

    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userInput){
        String result = "miss";                         // standardowo metoda zwróci missa

        int index = locationCells.indexOf(userInput); // pod index przypiszemy miejsce pod ktorym
                                            // znajduje sie argument uzytkownika - jezeli go nie bedzie to zwroci -1

        if (index >= 0){                        // jezeli cos sie znalazlo w liscie to index tego bedzie na pewno >= 0
            locationCells.remove(index);                 // w tym momencie usuwamy ten el z listy
        }

        if (locationCells.isEmpty()){           // sprawdzenie czy lista jest juz pusta
            result = "kill";                    // jezeli tak to znaczy zestrzelony
        } else {
            result = "hit";                     // jezeli nie tzn ze tylko trafiony bo cos jeszcze zostalo na liscie
        }
        return result;
    }

    public void setName(String poniez) {
    }
}
