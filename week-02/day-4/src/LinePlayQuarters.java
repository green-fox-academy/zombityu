import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {

        int canvasNumber = 4;
        int divide = (int) Math.sqrt(canvasNumber);
        int canvasSize = HEIGHT/divide;
        int step = 20/divide;

        line(graphics, 0, canvasSize, step );

    }


    private static void line(Graphics g, int x, int y, int step ) {
        for (int i = 0; i <16; i++) {
            for (int j = 0; j <2; j++) {
                g.setColor(Color.magenta);
                g.drawLine((y-step*i),x,y,(y-step*i));
            }
            g.setColor(Color.green);
            g.drawLine(x,y-step*i,y-step*i,y);

        }
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