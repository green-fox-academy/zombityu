import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        //---->Inputs<-----
        System.out.println("How many numbers you want: ");
        int count=scan.nextInt();


        //----->Integers<-----
        System.out.println("Add "+count+" numbers: ");
        for (int i = 0; i <count; i++) {
            int num = scan.nextInt();
            sum += num;

        }
        System.out.println("Sum of the numbers: "+sum);
        System.out.println("Average of the numbers: "+(float)sum/count);
    }
}
