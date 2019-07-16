package charsequence;

public class Main {
  public static void main(String[] args) {

    Gnirts g = new Gnirts("example");
    System.out.println(g.length());
    System.out.println(g.charAt(2));
    System.out.println(g.subSequence(0,5));

    Shifter s = new Shifter("example",2);
    System.out.println(s.length());
    System.out.println(s.charAt(0));


  }
}
