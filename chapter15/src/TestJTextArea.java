import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.ScrollPaneConstants.*;

public class TestJTextArea {
    public void go() {

        JFrame ramka = new JFrame();
        JPanel panel = new JPanel();
        JButton b1 = new JButton("click here");
        JTextArea textArea = new JTextArea(10, 20); // utworzenie pola textowego

        textArea.setLineWrap(true);// przenosszenie wyrazow do kolejnego wiersza

        b1.addActionListener(e -> textArea.append("button clicked\n")); //dodajemy ActionListenera
                            // na kazda akcje doda do pola textowedo ten tekst

        JScrollPane polePrzewijania = new JScrollPane(textArea);// utworzenie pola scrolowanego i wlozeniew niego
                                                                // pola textowego
        polePrzewijania.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS); // ustawienie scrollbarow
        polePrzewijania.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(polePrzewijania); // dodanie do panelu pola skrolowanego z umieszczonym w srodku
                                    // polem textowym

        ramka.getContentPane().add(BorderLayout.CENTER, panel); // dodanie do ramki komponentow
        ramka.getContentPane().add(BorderLayout.SOUTH, b1);

        ramka.setSize(350, 300);
        ramka.setVisible(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TestJTextArea t1 = new TestJTextArea();
        t1.go();
    }
}
