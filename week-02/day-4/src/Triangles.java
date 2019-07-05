import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {
        int size = WIDTH;
        int distance = 30;
        int step = WIDTH/distance+1;

        for (int i = 0; i < step; i++) {
            triangle(graphics, size, distance, i);
        }

    }

    private static void triangle(Graphics g, int size, int distance, int i) {
        g.drawLine(size/2+(distance*i)/2, distance*i,distance*i,size );
        g.drawLine(size/2-(distance*i)/2, (distance*i),size-(distance*i),size );
        g.drawLine((distance*i)/2, size-(distance*i),size-(distance*i)/2,size-(distance*i));
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
