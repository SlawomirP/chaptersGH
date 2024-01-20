import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        panelB.add(new JButton("Przycisk 1"));
        panelB.add(new JButton("Przycisk 2"));
        panelB.add(new JButton("Przycisk 3"));

        panelA.add(panelB);
    }
}
