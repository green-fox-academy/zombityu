import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Add a number: ");
        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("Not enough");
        } else if (num == 1) {
            System.out.println("The number is One");
        } else if (num == 2) {
            System.out.println("The number is Two");
        } else {
            System.out.println("A Lot");
        }
    }
}
