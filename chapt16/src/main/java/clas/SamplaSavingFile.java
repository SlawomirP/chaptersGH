package clas;

import java.io.FileWriter;
import java.io.IOException;

public class SamplaSavingFile {
    public static void main(String[] args) {

        try {

            FileWriter obiektZapisujacy = new FileWriter("test.txt");

            obiektZapisujacy.write("This is sample test for saving.");

            obiektZapisujacy.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
