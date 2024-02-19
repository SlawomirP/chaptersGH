import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTheFile {
    public static void main(String[] args) {

        try{
            // utworzenie pliku i obiektu filereadera
            File myFile = new File("text.txt");
            FileReader fileReader = new FileReader(myFile); // to jest połączenie

            BufferedReader reader = new BufferedReader(fileReader); //polaczenie filereadera z bufferedreaderem
            // dene z pliku zostana pobrane dopiero gdy bufor zostanie oproczniony - czyli gdy zostanie cały zczytany


            // utworzenie Stringa do przechowania odczytywanych wierszy
            String row;
            while((row = reader.readLine()) != null){ // tak dlugo jak obiekt bufferedreadera bedzie mial linijke to dzialaj
                System.out.println(row);
            }
            reader.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
