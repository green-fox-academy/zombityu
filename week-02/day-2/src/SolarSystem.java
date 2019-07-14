import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {
  public static void main(String[] args) {
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
    System.out.println(planetList);
    System.out.println(putSatur(planetList));
  }

  private static ArrayList <String> putSatur(ArrayList <String> planetList) {
    planetList.add(5,"Saturn");

    return planetList;
  }
}
