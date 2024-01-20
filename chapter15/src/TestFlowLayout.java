import javax.swing.*;
import java.awt.*;

public class TestFlowLayout {

    public void go () {

        JFrame ramka = new JFrame();
        JPanel panel = new JPanel();
        JButton p1 = new JButton("old");
        JButton p2 = new JButton("new button");
        JButton p3 = new JButton("new button2");

        panel.setBackground(Color.BLUE);

        // zmiana managera ukladu dla panelu
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(p1); // dodanie buttona do panelu
        panel.add(p2); // dodanie buttona do panelu
        panel.add(p3); // dodanie buttona do panelu

        ramka.getContentPane().add(BorderLayout.EAST, panel);
        ramka.setSize(200,200);
        ramka.setVisible(true);
    }

    public static void main(String[] args) {
        TestFlowLayout t1 = new TestFlowLayout();
        t1.go();
    }
}
