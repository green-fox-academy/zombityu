package main.java.music;

public class ElectricGuitar extends StringedInstrument {

 public ElectricGuitar(){
    super.numberOfStrings = 6;
    super.name = "Electric Guitar";
  }

  public ElectricGuitar(int numberOfStrings){
   super.numberOfStrings = numberOfStrings;
   super.name = "Electric Guitar";
  }

  @Override
  public String sound() {
    return  "Twang";
  }

  @Override
  public void play() {
    System.out.println(name+" a "+numberOfStrings+" - stringed instrument that goes "+sound());
  }
}
