import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class SplitMethodString {
    public static void main(String[] args) throws IOException {
        String text = "this is/split text/by this sign";

        String [] result = text.split("/");

        for (String s : result){
            System.out.println(s);
        }

        // STWORZENIE BUFFEREDWRITERA W NIO2//

        //1. utworzenie obiektu Path, do okreslenia polozenia pliku na dysku
        Path myRoute = Paths.get("myFile.txt");

        // jezeli plik znajduje sie w podkatalogu, np: program/files/myFile.txt
        Path myRoute2 = Paths.get("/program","files", "myFile.txt");

        //2. utworzenie BufferedWritera
        BufferedWriter writer = Files.newBufferedWriter(myRoute);
    }
}
