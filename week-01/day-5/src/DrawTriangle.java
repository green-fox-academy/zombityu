import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number: ");
        int a = scan.nextInt();

        for (int i = 0; i <= a ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");

            }
            System.out.println();


        }

    }
}
