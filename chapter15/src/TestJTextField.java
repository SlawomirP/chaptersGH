import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestJTextField {
    public void go() {

        JFrame ramka = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Name:");
        JTextField field = new JTextField(20);

        panel.add(label);
        panel.add(field);

        ramka.getContentPane().add(BorderLayout.NORTH, panel);

        // Dodanie nasłuchiwania zmian w JTextField
        field.addActionListener(new ActionListener() { // dodanie actionListenera
            @Override
            public void actionPerformed(ActionEvent e) { // nadpisanie actionPerformed
                String wpisaneSlowo = field.getText(); // podbranie słowa wpisanego w textField
                if (wpisaneSlowo.equalsIgnoreCase("zielony")) {
                    panel.setBackground(Color.GREEN); // zmienia kolor panelu jezeli slowo to zielony
                } else {
                    // Domyślny kolor panelu w przypadku innych słów
                    panel.setBackground(null);
                }
            }
        });

        ramka.setSize(300, 200);
        ramka.setVisible(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TestJTextField t1 = new TestJTextField();
        t1.go();
    }
}
