package Visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class Window extends JPanel {

    public Window() {
        this.setPreferredSize(new Dimension(800, 600)); // Set the window size
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Set the background color
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw some basic shapes
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100); // Draw a red square

        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100); // Draw a blue circle

        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 150, 300); // Draw a green line
    }
}