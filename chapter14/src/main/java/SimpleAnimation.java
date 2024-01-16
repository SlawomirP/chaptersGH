import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class SimpleAnimation {

    private int xPos = 70; // pola wspolrzednych wykorzystywane przez metode
    private int yPos = 70;// one benda inkrementowane za kazdym wywolaniem repaint()

    public void go (){

        JFrame frame = new JFrame(); // standardowo ramka
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel2 drawPanel = new MyDrawPanel2(); // obiekt rysujący

        frame.getContentPane().add(drawPanel); // ustawienia dla ramki
        frame.setSize(300,300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) { //wykonujemy 130 petli zwiekszajac wsp o 1 przy kazdym przejsciu
            xPos++;                     // i na obiekcie repaint
            yPos++;

            drawPanel.repaint();

            try{ // opoznienie watku aby bylo widac ruch
                TimeUnit.MILLISECONDS.sleep(150);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class MyDrawPanel2 extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);// mozna ustawic kolor tła np teraz biały
            g.fillRect(0,0, this.getWidth(), this.getHeight()); // to spowoduje wypelnienie tła białym kolorem
                                                // tak że za kazdym razem bedzie czarne tlo i kolko
                                                //bez tego po kolku zostanie ścieżka - jego poprzednia pozycja
            g.setColor(Color.green);
            g.fillOval(xPos,yPos,40,40); // narysowanie kola
        }
    }
}
