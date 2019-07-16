package main.java.music;

public class ElectricGuitar extends StringedInstrument {

 public ElectricGuitar(){
    super();
    super.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings){
   super.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return  "Twang";
  }


}
