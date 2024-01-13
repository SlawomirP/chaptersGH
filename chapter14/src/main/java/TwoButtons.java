import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons { // nie trzeba implementowac ActionListenera

    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go () {

        frame = new JFrame();
        label = new JLabel();

        JButton labelButton = new JButton("here change label");
        labelButton.addActionListener(new LabelListener());


        JButton colorButton = new JButton("Change circle color");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("Here is label");
        MyDrawPanel myDrawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500,400);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Clicked");
        }
    }

    class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

}
