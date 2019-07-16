package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(){
    super.numberOfStrings = 4;
    super.name = "Violin";
  }

  @Override
  public String sound() {
    return "Screetch";
  }

  @Override
  public void play() {
    System.out.println(name+" a "+numberOfStrings+" - stringed instrument that goes "+sound());
  }
}
