import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add the size of the square:  ");
        int side = scan.nextInt();


        for (int j = 0; j < side; j++) {
            System.out.print("% ");
        }
        System.out.println();
        for (int i = 0; i < side-2; i++) {
            System.out.print("% ");
            for (int z = 0; z < side-2; z++) {
                System.out.print("  ");
            }
            System.out.println("%");
        }

        for (int k = 0; k < side; k++) {
            System.out.print("% ");
        }



    }


}
