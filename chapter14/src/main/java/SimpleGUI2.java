import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI2 implements ActionListener { // implementacja interfejsu to powoduje że obiekt SimpleGUI2 jest
                                                    // ActionListenerem a button bedzie przekazywal info tylko do klas
                                                    // które implementuja interfejs ActionListenera
    private JButton button;  // deklaracja buttona

    public static void main(String[] args) {
        SimpleGUI2 gui = new SimpleGUI2();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame(); // deklaracja ramki
        button = new JButton("click me"); // przypisanie do buttona obiektu i nadanie mu nazwy


        button.addActionListener(this); // to rejestruje w buttonie nas jako odbiorce zdarzenia - this -
                                            // obiekt tu przekazanyMUSI implementowac ActionListenera

        frame.getContentPane().add(button); // dodanie przycisku do zawartosci okna
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamkniecie programu po zamknieciu okna
        frame.setSize(300,300); // wymiary okna
        frame.setVisible(true); // widocznosc
    }

    @Override
    public void actionPerformed(ActionEvent e) { // implementacja metody actionPerformed do obsługi eventow
        button.setText("I've been clicked");
    }
}
