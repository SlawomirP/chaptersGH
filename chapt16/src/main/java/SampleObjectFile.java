import java.io.File;

public class SampleObjectFile {
    public static void main(String[] args) {

        // obiekt reprezentujacy istniejacy plik
        File newFile = new File("name_file.txt");

        // utworzenie nowego folderu
        File newFolder = new File("folder_name");
        newFolder.mkdir();

        //wyswietlenie zawartosci folderu
        if (newFolder.isDirectory()){
            String [] zawartoscNewFolder = newFolder.list();
            for(String e : zawartoscNewFolder){
                System.out.println(e);
            }
        }

        // usuniecie pliku lub folderu - zwraca booleana true jezeli usa sie usunac
        boolean isRemoved = newFile.delete();

    }
}
