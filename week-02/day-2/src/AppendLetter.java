import java.util.*;

public class AppendLetter {
  public static void main(String[] args){

    List <String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");


    System.out.println(appendA(far));
}

  private static ArrayList <String> appendA( List<String> far) {
    ArrayList <String> appendA = new ArrayList<>();
    for (int i = 0; i <far.size() ; i++) {
      appendA.add(far.get(i)+"a");
    }

    return appendA;
  }
}
