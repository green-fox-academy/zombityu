import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Add a number:  ");

        int num = 19;
        int myNum;

        do {
            myNum = scan.nextInt();


            if ( myNum > num) {
                System.out.print("Lower! \n"+" Try again \n");
            } else {
                System.out.print("Higher! \n"+" Try again \n");
            }
        } while (myNum != num );

        System.out.println("Congratulation!!!");

    }
}
