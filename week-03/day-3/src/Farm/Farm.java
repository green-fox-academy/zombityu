package Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    int freeSlots;
    ArrayList<Animal> animalList = new ArrayList<>();

    Farm(int freeSlots){
        this.freeSlots = freeSlots;
        animalList();

    }

        public ArrayList <Animal> animalList() {
            Animal dog = new Animal(50);
            Animal chicken = new Animal(20);
            Animal cat = new Animal(10);
            Animal pig = new Animal(70);

            animalList.add(dog);
            animalList.add(chicken);
            animalList.add(cat);
            animalList.add(pig);

            return animalList;
        }


    void breed(Animal animal){
        if (animalList.size() < freeSlots){
            animalList.add(animal);
        }
    }


    void slaughter (){
        int min =animalList.get(0).hunger;
        List<Animal> death = new ArrayList<>();
        for (int i = 0; i <animalList.size(); i++) {
            if (animalList.get(i).hunger < min){
                min = animalList.get(i).hunger;
                death.add(animalList.get(i));
            }
        }
        animalList.removeAll(death);
    }
    
}
