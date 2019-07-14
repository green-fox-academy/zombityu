import java.util.*;

public class MatchMaking {
  public static void main(String[] args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

    System.out.println(makingMatches(girls, boys));
  }

  private static ArrayList <String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
//    ArrayList<String> pairs = new ArrayList<>();
    for (int i = 0; i <girls.size() ; i++) {
     boys.add(i*2+1,girls.get(i));
      }

    return boys;
  }
}
