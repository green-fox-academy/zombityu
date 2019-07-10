package Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("red",12.5);
        sharpie1.use();
        System.out.println(sharpie1.inkAmount);

    }
}
