package Farm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Farm myFarm = new Farm(6);

        System.out.println(myFarm);
        myFarm.breed(new Animal("horse"));
        myFarm.breed(new Animal("horse"));
        myFarm.breed(new Animal("horse"));
        System.out.println(myFarm);
        myFarm.slaughter();
        System.out.println(myFarm);


    }
}
