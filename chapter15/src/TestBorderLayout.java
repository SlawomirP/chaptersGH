import javax.swing.*;
import java.awt.*;

public class TestBorderLayout {
    public void go() {

        JFrame frame = new JFrame(); // stworzenie ramki
        JButton przycisk = new JButton("click here!"); // stworzenie buttona

        frame.getContentPane().add(BorderLayout.EAST, przycisk); // umieszczenie przycisku we wschodnim regionie
        frame.setSize(200,200); // ustawienia dla ramki
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        TestBorderLayout gui = new TestBorderLayout();
        gui.go();
    }
}
