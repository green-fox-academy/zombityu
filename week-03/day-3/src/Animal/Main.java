package Animal;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.eat();
        lion.drink();
        lion.play();
        System.out.println(lion.thirst);

        Animal cat = new Animal();
        cat.play();
        System.out.println(cat.thirst+" "+cat.thirst);
    }
}
