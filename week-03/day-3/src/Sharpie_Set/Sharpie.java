package Sharpie_Set;

public class Sharpie {
    String color;
    double width;
    double inkAmount;

    Sharpie( String color, double width, int inkAmount){
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    void use(double amount){
        this.inkAmount -= amount;
    }

    @Override
    public String toString() {
        return  color + " Width: "+width+" Ink: "+ inkAmount;
    }
}
