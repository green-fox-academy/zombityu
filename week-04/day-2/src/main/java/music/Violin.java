package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(){
    super();
    super.numberOfStrings = 4;
  }

  @Override
  public String sound() {
    return "Screetch";
  }


}
