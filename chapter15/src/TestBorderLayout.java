import javax.swing.*;
import java.awt.*;

public class TestBorderLayout {
    public void go() {

        JFrame frame = new JFrame();

        frame.getContentPane().add(BorderLayout.NORTH, new JButton("North"));
        frame.getContentPane().add(BorderLayout.SOUTH, new JButton("South"));
        frame.getContentPane().add(BorderLayout.EAST, new JButton("East"));
        frame.getContentPane().add(BorderLayout.WEST, new JButton("West"));
        frame.getContentPane().add(BorderLayout.CENTER, new JButton("Center"));
        frame.setSize(200,200);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        TestBorderLayout gui = new TestBorderLayout();
        gui.go();
    }
}
