import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {


        int canvasNumber = 17;
        int cubes = 16;
        int divide = (int) Math.sqrt(cubes);
        int newSize = HEIGHT/divide;
        int step = 20/divide;
        int size = HEIGHT/divide;


        for (int k = 0; k <divide; k++) {
            for (int j = 0; j <divide; j++) {
                line(graphics,size,j,k,canvasNumber,step);
            }
        }



    }


    private static void line(Graphics g, int size, int j, int k,int canvasNumber,int step) {
        for (int i = 0; i <canvasNumber; i++) {
            g.setColor(Color.magenta);
            g.drawLine(size/size+(j*size)+i*step,size/size+(k*size),size+(j*size) ,size/size+i*step+(k*size));

            g.setColor(Color.green);
            g.drawLine(size/size+(j*size),size-i*step+(k*size),size-i*step+(j*size),size+(k*size));

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