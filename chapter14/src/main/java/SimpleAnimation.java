import javax.swing.*;

public class SimpleAnimation {

    private int xPos = 70;
    private int yPos = 70;

    public void go (){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            xPos++;
            yPos++;

            drawPanel.repaint();
        }
    }
}
