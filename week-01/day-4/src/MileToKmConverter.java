import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add your distance in mile: ");
        double mile = scan.nextDouble();
        double km = mile*1.609344;
        System.out.println("Your distance is "+km+"km");





    }


}
