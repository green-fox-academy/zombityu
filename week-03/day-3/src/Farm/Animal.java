package Farm;

public class Animal {
    int hunger;
    int thirst;
    String name;

    Animal( String name){
        this.name = name;
        hunger = 50;
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

    @Override
    public String toString() {
        return ", name: " + name +
                ", hunger: " + hunger +
                ", thirst: " + thirst;
    }
}
