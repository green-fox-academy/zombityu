import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 2 int: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 < num2){
            for (int i = num1; i<num2; i++) {
                System.out.println(i);
            }
        }else if (num2 < num1){
            System.out.println("The second number should be bigger");
        }


    }
}


