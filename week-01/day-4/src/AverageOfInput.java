import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num = 0;

        System.out.println("How many numbers would you like:  ");
        num=scan.nextInt();

        System.out.println("Add " + num+ " integer: ");
        for (int i = 0; i < num; i++) {
            int input = scan.nextInt();
            sum += input;

        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+(float)sum/num);






    }

}
