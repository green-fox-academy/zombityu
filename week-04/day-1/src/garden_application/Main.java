package garden_application;



public class Main {

  public static void main(String[] args) {
   Garden myGarden = new Garden();

    Plant flower1 = new Flower("red");
    Plant flower2 = new Flower("blue");
    Plant tree1 = new Tree("Pink");
    Plant tree2 = new Tree("yellow");

    myGarden.addPlants(flower1);
    myGarden.addPlants(flower2);
    myGarden.addPlants(tree1);
    myGarden.addPlants(tree2);

    myGarden.info();
    System.out.println("");
    myGarden.watering(40);
    myGarden.info();
    System.out.println("");

    myGarden.watering(70);

    myGarden.info();



  }
}
