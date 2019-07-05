import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int distance = 10;
        int size = WIDTH/2;

        for (int i = 0; i <14; i++) {
            starLine(graphics,size,distance,i);
        }
        }

    private static void starLine(Graphics g, int size, int distance, int i) {
        g.setColor(Color.green);
        g.drawLine(size,20+distance*i,size-distance*i,size);
        g.drawLine(size-distance*i,size,size,WIDTH-20-distance*i);
        g.drawLine(size,20+distance*i,size+distance*i,size);
        g.drawLine(size,WIDTH-20-distance*i,size+distance*i,size);

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
