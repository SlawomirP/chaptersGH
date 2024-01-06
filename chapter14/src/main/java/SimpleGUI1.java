import javax.swing.*;

public class SimpleGUI1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // stworzenie ramki
        JButton button = new JButton("click me"); // to co sie wyswietli na przycisku

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamkniecie programu po zamknieciu okna
                                                                // WAZNE to jest
        frame.getContentPane().add(button); // doda ten przycisk do ramki

        frame.setSize(300,300); // wielkosc ramki wyrazona w pixelach

        frame.setVisible (true); // to wazne - widocznosc ramki na TRUE
    }
}
