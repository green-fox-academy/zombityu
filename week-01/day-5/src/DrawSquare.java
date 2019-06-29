import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Add the height of the square:  ");
        int height = scan.nextInt();
        //System.out.println("Add the width of the square: ");
        //int width = scan.nextInt();
        int width;
        width=height;

        for (int j = 0; j < width; j++) {
            System.out.print("% ");
        }
        System.out.println();
        for (int i = 0; i < height; i++) {
            System.out.print("% ");
            for (int z = 0; z < height - 2; z++) {
                System.out.print("  ");
            }
            System.out.println("%");
        }

        for (int k = 0; k < width; k++) {
            System.out.print("% ");
        }

    }


}
