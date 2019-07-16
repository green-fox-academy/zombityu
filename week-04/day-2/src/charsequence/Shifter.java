package charsequence;

public class Shifter implements CharSequence{
  String name;
  int shift;

  Shifter(String name, int shift){
    this.name = name;
    this.shift = shift;

  }
  @Override
  public int length() {
    return this.name.length();
  }

  @Override
  public char charAt(int index) {
    return name.charAt(index+shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return name.subSequence(start+shift,end+shift);
  }
}
