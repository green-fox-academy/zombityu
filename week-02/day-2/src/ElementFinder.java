import java.util.*;

public class ElementFinder {
  public static void main(String[] args) {

    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
    System.out.println(containsSeven(arrayList));


  }

  private static String containsSeven(ArrayList<Integer> arrayList) {
    for (int i = 0; i <arrayList.size() ; i++) {
      if (arrayList.get(i)==7){
        return "Hoooray";
      }
    }
    return "Noooo!";
  }
}
