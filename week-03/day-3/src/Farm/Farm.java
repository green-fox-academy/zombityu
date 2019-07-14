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
            Animal dog = new Animal("dog");
            dog.play();
            Animal chicken = new Animal("chicken");
            chicken.eat();
            chicken.eat();
            Animal cat = new Animal("cat");
            cat.drink();
            Animal pig = new Animal("pig");
            pig.eat();
            pig.eat();
            pig.eat();

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
        int index = 0;
        int min =animalList.get(0).hunger;
        for (int i = 0; i <animalList.size(); i++) {
            if (animalList.get(i).hunger < min){
                min = animalList.get(i).hunger;
                index = i;
            }
        }
        animalList.remove(index);
    }

    @Override
    public String toString() {
        return  "AnimalList " + animalList;
    }
}
