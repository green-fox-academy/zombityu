import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int a = scan.nextInt();

        int count=1;
        for(int i=1;i<=2*a-1;i++)
        {
            for(int j=count;j<=a;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=count*2-1;k++)
            {
                System.out.print("* ");
            }
            if(i<a)
                count++;
            else
                count--;
            System.out.println("");
        }

    }

}
