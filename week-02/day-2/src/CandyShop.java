import java.util.*;

public class CandyShop {
  public static void main(String[] args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);


    System.out.println(sweets(arrayList));

  }

  private static ArrayList <Object> sweets(ArrayList<Object> arrayList) {
//    for (int i = 0; i <arrayList.size(); i++) {
//      if (arrayList.get(i).equals(2)){
//        arrayList.remove(1);
//        arrayList.add(1,"Croissant");
//      } else if (arrayList.get(i).equals(false)){
//        arrayList.add("Ice cream");
//        arrayList.remove(false);
//      }
//    }

    arrayList.set(1,"Croissant");
    arrayList.set(3,"Ice Cream");

    return arrayList;
  }
}
