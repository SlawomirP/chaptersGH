import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons { // nie trzeba implementowac ActionListenera

    private JFrame frame; //ramka
    private JLabel label; // etykietka do zmiany teksu

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go () {

        frame = new JFrame();
        label = new JLabel();

        JButton labelButton = new JButton("here change label"); // stworzenie przucisku to zmiany taxtu w etykiecie
        labelButton.addActionListener(event -> label.setText("Clicked")); // przypisanie mu listenera, bedzie to obiekt klasy
                                                            // wewnetrznej ktory reaguje na klikniecie


        JButton colorButton = new JButton("Change circle color"); // tu kolejny przycisk do narysowania kola
        colorButton.addActionListener(event -> frame.repaint()); // przypisanie mu listenera z drugiej klasy wewnetrznej

        label = new JLabel("Here is label"); // obiekt etykietki z napisem
        MyDrawPanel myDrawPanel = new MyDrawPanel(); // obiekt kroty rysuje

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton); // rozmieszczenie komponentow w frame
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500,400); // ustawienia frame'a
        frame.setVisible(true);
    }

//    class LabelListener implements ActionListener { // klasa wewnetrza reagujaca na klik buttona od labela
//        @Override
//        public void actionPerformed(ActionEvent e) { // i metoda zmieniajaca napis
//            label.setText("Clicked");
//        }
//    }
//
//    class ColorListener implements ActionListener { // klasa wewnetrzna od rysowania kolka
//        @Override
//        public void actionPerformed(ActionEvent e) { // i metoda powodujaca ponownie wysiwetlenie w ramce
//            frame.repaint();                        // uaktywniajaca wszystkie metody paintComponents()
//        }
//    }
}
