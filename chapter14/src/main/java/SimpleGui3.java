import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3 implements ActionListener { // implementacja listenera do buttona

    private JFrame frame;

    public void go () {

        frame = new JFrame(); // przypisanie obiektu do referenji
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamkniecie ramki po zamkn okna

        JButton button = new JButton("Here you can change color"); // utwprzenie butona z nazwa
        button.addActionListener(this); // rejestracja w buttonie listenera


        MyDrawPanel drawPanel = new MyDrawPanel(); // stworzenie obiektu rysujacego


        frame.getContentPane().add(BorderLayout.SOUTH, button);// wstawienie buttona na dole
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);//wstawienie rysowania na srodku
        frame.setSize(300,300);//ustawienie wymiaru frame'a
        frame.setVisible(true);// ustawienie widocznosci

    }
    @Override
    public void actionPerformed (ActionEvent e){
        frame.repaint();
    } //nadpisana metoda ktora jest wywolana
                //w przypadku pojawienia sie eventu na buttonie - repaint powoduje odswiezenie komponentow
                //w ramce

}
