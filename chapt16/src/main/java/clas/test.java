package clas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test {
    public static void main(String[] args) throws IOException {

        GameChar character1 = new GameChar();
        GameChar character2 = new GameChar();
        GameChar character3 = new GameChar();

        FileOutputStream strumienPlik = new FileOutputStream("MyGame.ser");


        ObjectOutputStream os = new ObjectOutputStream(strumienPlik);


        os.writeObject(character1);
        os.writeObject(character2);
        os.writeObject(character3);


        os.close();


    }
}
