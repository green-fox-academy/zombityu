import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        for (int i = 0; i <HEIGHT; i++) {
            for (int j = 0; j <WIDTH; j++) {
                if ((i+j)%2==0) {
                    chessBlack(graphics,40*i,40*j);
                }

            }
            }
        }


    private static void chessBlack(Graphics g,int x, int y) {
        g.setColor(Color.black);
        g.fillRect(x,y,40,40);


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