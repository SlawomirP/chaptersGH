package handlingWithTextFile;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CardEditor { // creating and saving cards
    private ArrayList<Card> cardList = new ArrayList<Card>();
    private JTextArea question;
    private JTextArea answer;
    private JFrame frame;

    public static void main(String[] args) {
        new CardEditor().go();
    }

    public void go() {
        frame = new JFrame("Card editor");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        question = createTextArea(bigFont);
        JScrollPane scrollQuestion = addScroll(question);
        answer = createTextArea(bigFont);
        JScrollPane scrollAnswer = addScroll(answer);

        mainPanel.add(new JLabel("Question: "));
        mainPanel.add(scrollQuestion);
        mainPanel.add(new JLabel("Answer: "));
        mainPanel.add(scrollAnswer);

        JButton buttonNextCard = new JButton("Next card"); //stworzenie buttona o nazwie wyswietlanej next card
        buttonNextCard.addActionListener(e -> nextCard()); // dodanie do tego buttona listenera ktory powoduje uruchomienie metody
        // nextCard po nacisnieciu
        mainPanel.add(buttonNextCard); // dodanie buttona do main panela

        JMenuBar menuStrip = new JMenuBar();
        JMenu menuFile = new JMenu("File");

        JMenuItem optionNew = new JMenuItem("New");
        optionNew.addActionListener(e -> clearAll());

        JMenuItem optionSave = new JMenuItem("Save");
        optionSave.addActionListener(e -> saveCard());

        menuFile.add(optionNew);
        menuFile.add(optionSave);
        menuStrip.add(menuFile);
        frame.setJMenuBar(menuStrip);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);


    }

    private JScrollPane addScroll(JTextArea textAreaToAddScroll) { // DODANIE SCROLLA
        JScrollPane withScrolling = new JScrollPane(textAreaToAddScroll);
        withScrolling.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        withScrolling.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        return withScrolling;
    }

    private JTextArea createTextArea(Font font) { // zwrotka pola tekstowego z ustawieniami
        JTextArea textArea = new JTextArea(6, 20);// utworzenie obszaru textowego - zapis/odczyt - GUI
        textArea.setLineWrap(true); //zawijanie textu - true
        textArea.setWrapStyleWord(true);//zawijanie textu dziala po skonczeniu słowa a nie np w jego srodku
        textArea.setFont(font);// ustawienie czcionki w polu tekstowym
        return textArea;
    }

    private void nextCard() { // utworzy nowy obiekt card gdzie wstawiony zostanie text pobrany z pola question
        // i z pola answer a nastepnie card zostanie umieszczony w arrayliscie
        Card card = new Card(question.getText(), answer.getText());
        cardList.add(card);
        clearCard();// wyczyszczenie listy czyli tak naprawde edtseirnir w question i answer pustego miejsca
    }

    private void saveCard() {
        Card card = new Card(question.getText(), answer.getText());// tworzy nowa karte z textu pobranego z question i answer
        cardList.add(card); // i dodaje ja do listy

        JFileChooser objectSavingFile = new JFileChooser();// stworzenie obiektu JFileChooser ktory umozliwia wybor
        //lokalizacji oraz pliku do zapisu danych
        objectSavingFile.showSaveDialog(frame); // to wyswietla na obiekcie jFileChoosera okno dialogowe do wyboru lokalizacji
        // oraz pliku
        saveFile(objectSavingFile.getSelectedFile()); // getSelectedFile zwraca wybrany plik - to bedzie ten do zapisu
        // on iidzie jako plik do zapisania do metody saveFile
    }

    private void clearCard() {
        question.setText("");
        answer.setText("");
        question.requestFocus(); // obszar question robi sie aktuwny, dostaje focusa i czeka na dane od uzytkownika
    }

    private void clearAll() {
        cardList.clear();
        clearCard();
    }

    private void saveFile(File file) { // zapis danych pytanie/odpowiedz do pliku

        try { //stworzony zostaje obiekt bufferedWritera który zapisuje dane do pliku
            //i zostaje polaczony przez obiekt fileWritera z plikiem do zapisu
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for (Card card : cardList) { // dla kazdej karty obiekt zapisujacy zapisuje tresc pytania i odpowiedzi do pliku
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer() + "\n");
            }

            writer.close(); // zwalniamy zasoby systemowe
        } catch (IOException e) {
            System.out.println("File was no saved" + e.getMessage());
        }

    }

}
