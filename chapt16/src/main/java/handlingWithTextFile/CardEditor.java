package handlingWithTextFile;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CardEditor { // creating and saving cards
    private ArrayList <Card> cardList = new ArrayList<Card>();
    private JTextArea question;
    private JTextArea answer;
    private JFrame frame;

    public static void main(String[] args) {
        new CardEditor().go();
    }

    public void go () {
        frame = new JFrame("Card editor");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);



    }

    private JScrollPane addScroll(JTextArea textAreaToAddScroll){ // DODANIE SCROLLA
        JScrollPane withScrolling = new JScrollPane(textAreaToAddScroll);
        withScrolling.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        withScrolling.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        return withScrolling;
    }

    private JTextArea createTextArea(Font font){ // zwrotka pola tekstowego z ustawieniami
        JTextArea textArea = new JTextArea(6,20);// utworzenie obszaru textowego - zapis/odczyt - GUI
        textArea.setLineWrap(true); //zawijanie textu - true
        textArea.setWrapStyleWord(true);//zawijanie textu dziala po skonczeniu słowa a nie np w jego srodku
        textArea.setFont(font);// ustawienie czcionki w polu tekstowym
        return textArea;
    }


}
