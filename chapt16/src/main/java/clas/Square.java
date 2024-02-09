package clas;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class Square implements Serializable {
    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public static void main(String[] args) {
        Square squareDoZapisania = new Square(50,50);

        try{
            FileOutputStream obiektFileOutputStreama = new FileOutputStream("square.ser");

            ObjectOutputStream obiektOutputStreama = new ObjectOutputStream(obiektFileOutputStreama);

            obiektOutputStreama.writeObject(squareDoZapisania);

            obiektOutputStreama.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
