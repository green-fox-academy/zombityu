package Petrol_Station;

public class Station {
        int gasAmount;

    void refill(Car car){
        this.gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
    }
}
