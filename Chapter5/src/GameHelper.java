import java.util.Scanner;

public class GameHelper {

    //4 UZUPELNIENIE KLASY GAMEHELPERA - TEGO CO POBIERA OD USERA

    public int getUserInput(String prompt) {
        System.out.println((prompt + ": "));
        Scanner scanner = new Scanner(System.in); // scanner z intem
        return scanner.nextInt();
    }
}
