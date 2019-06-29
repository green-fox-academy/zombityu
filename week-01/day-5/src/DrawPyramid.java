import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int a =scan.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = a-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
