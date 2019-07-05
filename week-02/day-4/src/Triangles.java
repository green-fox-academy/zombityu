import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {
        int size = WIDTH;
        int distance =20;
        int step = WIDTH/distance+1;

        for (int i = 0; i <step; i++) {
            triangle(graphics,size/2+(distance*i)/2, distance*i,distance*i,size );
            triangle(graphics,size/2-(distance*i)/2, (distance*i),size-(distance*i),size );
            triangle(graphics,(distance*i)/2, size-(distance*i),size-(distance*i)/2,size-(distance*i));
        }




    }

    private static void triangle(Graphics g, int x, int y, int xx, int yy) {
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