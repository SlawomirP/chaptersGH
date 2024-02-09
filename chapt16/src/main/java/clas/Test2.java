package clas;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Hero p1 = new Hero(50, "elf", new String [] {"bow", "sword", "dust"});
        Hero p2 = new Hero(250, "troll", new String [] {"hands", "axe"});
        Hero p3 = new Hero(150, "mage", new String [] {"magic", "invisibility"});


        try{
            ObjectOutputStream objDoZapisu = new ObjectOutputStream(new FileOutputStream("Game.ser"));

            objDoZapisu.writeObject(p1);
            objDoZapisu.writeObject(p2);
            objDoZapisu.writeObject(p3);
            objDoZapisu.close();

        } catch(Exception e){
            e.printStackTrace();
        }

        try{
            ObjectInputStream objDoOdczytu = new ObjectInputStream(new FileInputStream("Game.ser"));
            Hero char1 = (Hero) objDoOdczytu.readObject();
            Hero char2 = (Hero) objDoOdczytu.readObject();
            Hero char3 = (Hero) objDoOdczytu.readObject();

            System.out.println("p1: " + char1.getTyp());
            System.out.println("p2: " + char2.getTyp());
            System.out.println("p3: " + char3.getTyp());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
