import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {

    public static void mainDraw(Graphics graphics) {

        int side = 20;


        for (int i = 0; i <9; i++) {
            hexagon(graphics,WIDTH/2-side/2,HEIGHT/8*(i+1),WIDTH/2+side/2,HEIGHT/8*(i+1));
        }




    }

    private static void hexagon(Graphics g, int x, int y, int xx, int yy) {
        g.drawLine(x,y,xx,yy);
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

