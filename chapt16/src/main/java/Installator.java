import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Installator {
    public static void main(String[] args) {
        try{

            //stworzenie sciezek
            Path sciezka1 = Paths.get("MojaApka");
            Path sciezka2 = Paths.get("MojaApka", "media");
            Path sciezka3 = Paths.get("MojaApka", "kody");

            Path kody = Paths.get("MojaApka.class");
            Path media = Paths.get("MojaApka.jpeg");

            Files.createDirectory(sciezka1);
            Files.createDirectory(sciezka2);
            Files.createDirectory(sciezka3);

            Files.move(kody, sciezka3.resolve(kody.getFileName()));
            Files.move(media, sciezka2.resolve(media.getFileName()));


        } catch(Exception e){
            System.out.println("wyjatek:" + e.getMessage());
        }
    }
}
