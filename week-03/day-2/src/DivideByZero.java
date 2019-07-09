import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Give me a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(divide(number));

    }

    private static int divide(int number) {
        int result  = 0;
        try {
            result = 10 / number;
        } catch ( ArithmeticException e ){
            System.out.println("Can't divide with zero!");
        }
        return result;
    }
}
