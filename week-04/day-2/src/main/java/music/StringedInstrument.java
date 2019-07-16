package main.java.music;

public abstract class StringedInstrument extends Instrument{
 int numberOfStrings;


  public StringedInstrument(){}

  public StringedInstrument(int numberOfStrings){
   this.numberOfStrings = numberOfStrings;
 }

 String sound(){
    return null;
 }

  @Override
  void play() {
    System.out.println(name+" a "+numberOfStrings+" - stringed instrument that goes "+sound());
  }
}
