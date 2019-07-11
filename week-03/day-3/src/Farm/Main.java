package Farm;

public class Main {

    public static void main(String[] args) {
        Farm myFarm = new Farm();
        Animal pig = new Animal();
        Animal horse = new Animal();
        Animal dog = new Animal();

        myFarm.add(pig);
        myFarm.add(horse);
        myFarm.add(dog);

    }
}
