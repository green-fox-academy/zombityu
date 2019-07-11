package Sharpie_Set;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpieList = new ArrayList<>();

    void add(String color,double width){
        sharpieList.add(new Sharpie(color,width));
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
}
