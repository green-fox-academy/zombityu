import java.util.Scanner;

public class Cuboid {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add the cuboid 3 sides: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double volume = a+b+c;
        double surfaceArea=2*a*b+2*b*c+2*a*c;

        System.out.println("The cuboid volume is : "+volume);
        System.out.println("The cuboid surfaceArea is :"+surfaceArea);


    }




}
