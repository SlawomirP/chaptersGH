import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.fillRect(0,0, this.getWidth(), this.getHeight()); // wypelnienie na czarno calego okna

        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        Color randomColor = new Color (red, green, blue); // utworzenie obiektu koloru
        g.setColor(randomColor); // ustawienie go jako koloru obiektu g
        g.fillOval(50,50,100,100); // narysowanie kola
    }
}
