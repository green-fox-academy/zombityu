package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(){
   super.numberOfStrings = 4;
   super.name = "Bass Guitar";
 }

  public BassGuitar(int numberOfStrings){
    super.numberOfStrings = numberOfStrings;
    super.name = "Bass Guitar";

  }

  @Override
 public String sound() {
    return  "Dum-duum-duum";
  }

  @Override
  public void play() {
    System.out.println(name+" a "+numberOfStrings+" - stringed instrument that goes "+sound());
  }
}

