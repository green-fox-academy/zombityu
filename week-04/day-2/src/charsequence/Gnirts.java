package charsequence;

public class Gnirts implements CharSequence {
 String name;

 Gnirts(String name){
    this.name = name;
  }

  @Override
  public int length() {
     return this.name.length();
  }

  @Override
  public char charAt(int index) {
    char [] nameArr = name.toCharArray();
    for (int i = name.length()-1; i >= 0 ; i--) {
      if (i == index){
        return nameArr[i];
      }
    }
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
