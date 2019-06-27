import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add the numbers of chicken: ");
        int chicken = scan.nextInt();
        System.out.println("Add the numbers of pigs: ");
        int pig = scan.nextInt();

        int legs = (chicken*2)+(pig*4);
        System.out.println("The numbers of legs: "+legs);
    }
}
