package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(){
    super();
    super.numberOfStrings = 4;
 }

  public BassGuitar(int numberOfStrings){
    super.numberOfStrings = numberOfStrings;

  }

  @Override
 public String sound() {
    return  "Dum-duum-duum";
  }


}

