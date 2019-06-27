import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

}
