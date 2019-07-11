package Farm;

public class Animal {
    int hunger;
    int thirst;
    String name;

    Animal( int hunger){
        this.hunger = hunger;
        thirst = 50;
    }

    void eat(){
        hunger--;
    }
    void drink(){
        thirst--;
    }
    void play(){
        hunger++;
        thirst++;
    }

}
