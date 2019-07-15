package garden_application;

public class Plant {
  String color;
  int currentWaterAmount;
  int limit;
  double plantAbsorb;


  Plant() {

  }

  void needWater() {
    if (currentWaterAmount < limit) {
      System.out.println("The " + color +" "+ getClass().getSimpleName() + " needs water");
    } else {
      System.out.println("The " + color +" "+getClass().getSimpleName() + " doesn't needs water.");
    }


  }
}