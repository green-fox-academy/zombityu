package garden_application;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> plants = new ArrayList<>();

  Garden() {
  }

  void addPlants(Plant plant) {
    plants.add(plant);
  }

  void watering(float number) {
    System.out.println("Watering with: " + number);
    int count = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).currentWaterAmount < plants.get(i).limit) {
        count++;
      }
    }
    number /= count;

    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).currentWaterAmount < plants.get(i).limit) {
        plants.get(i).currentWaterAmount += number * plants.get(i).plantAbsorb;
      }
    }
  }
  void info(){
    for (int i = 0; i <plants.size(); i++) {
      plants.get(i).needWater();
    }
  }
}




