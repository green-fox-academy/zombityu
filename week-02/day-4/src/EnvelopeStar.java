import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int distance = 10;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        graphics.setColor(Color.green);
        for (int i = 0; i <15; i++) {
            graphics.drawLine(160,20+a,160-a,160);
            a=distance*i;
        }
        for (int i = 0; i <15; i++) {
            graphics.drawLine(160-b,160,160,300-b);
            b=distance*i;
        }
        for (int i = 0; i <15; i++) {
            graphics.drawLine(160,20+c,160+c,160);
            c=distance*i;

        }
        for (int i = 0; i <15; i++) {
            graphics.drawLine(160,300-d,160+d,160);
            d=distance*i;
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
