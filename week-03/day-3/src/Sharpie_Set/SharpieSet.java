package Sharpie_Set;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpieList = new ArrayList<>();

    SharpieSet(){
      sharpieList();
    }


  public List<Sharpie> sharpieList (){
    Sharpie blue = new Sharpie("Blue",20,12);
    Sharpie green = new Sharpie("Green",30,10);
    Sharpie red = new Sharpie("Red",25,22);
    Sharpie yellow = new Sharpie("Yellow",10,30);

    sharpieList.add(blue);
    blue.use(12);
    sharpieList.add(green);
    green.use(10);
    sharpieList.add(red);
    sharpieList.add(yellow);

    return sharpieList;
  }


   int countUsable(){
        int counter = 0;
       for (Sharpie  sharpie:sharpieList) {
           if (sharpie.inkAmount > 0){
               counter++;
           }
       }
       return  counter;
   }

   List removeTrash(){
        List<Sharpie> temp = new ArrayList<>();
//       int countRemoved = 0;
       for (Sharpie sharpie:this.sharpieList) {
           if (sharpie.inkAmount <= 0){
               temp.add(sharpie);
//               countRemoved++;
           }
       }
       sharpieList.removeAll(temp);
       return sharpieList;
   }

  @Override
  public String toString() {
    return "sharpieList " + sharpieList;
  }
}
