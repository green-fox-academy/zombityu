import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Add an integer: ");
            int input = scan.nextInt();
            sum += input;
            avg += 1;


        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+(double)sum/avg);






    }

}
