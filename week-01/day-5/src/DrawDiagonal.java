import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add the size of the square:  ");
        int side = scan.nextInt();


        for (int i = 0; i < side; i++) {

            // Loop denoting columns
            for (int j = 0; j < side; j++) {


                if (i == 0 || j == 0 || i == j || i == side - 1 || j == side - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
