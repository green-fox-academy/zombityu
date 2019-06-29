import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {


        System.out.println("Please give me a number: ");
        Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();

            for (int i = 1; i <=10 ; i++) {
                System.out.println(i+"*"+num+"="+i*num);
        }

    }

}
