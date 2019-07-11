package Petrol_Station;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Station mol = new Station();

        System.out.println(porsche.capacity);
        System.out.println(porsche.gasAmount);

        mol.refill(porsche);

        System.out.println(porsche.capacity);
        System.out.println(porsche.gasAmount);
    }
}
