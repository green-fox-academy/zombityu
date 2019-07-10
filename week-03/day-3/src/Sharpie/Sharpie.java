package Sharpie;

public class Sharpie {
    String color;
    double width;
    double inkAmount;

    Sharpie( String color, double width){
        this.color = color;
        this.width = width;
        inkAmount = 100;
    }

    void use(){
        inkAmount--;
    }

}
