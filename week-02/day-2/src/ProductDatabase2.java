import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        listAdd(list);
        System.out.println(costLess201(list));
        System.out.println(costMoreThan150(list));
        
    }


    private static HashMap costMoreThan150(HashMap<String, Integer> list) {
        HashMap<String,Integer> cost = new HashMap<>();
        for (Map.Entry<String,Integer> entry:list.entrySet()) {
            if (entry.getValue()>150){
                cost.put(entry.getKey(),entry.getValue());
            }

        }
        return cost;

    }

    private static ArrayList costLess201(HashMap<String, Integer> list) {
        ArrayList<String> product = new ArrayList<>();
        for (Map.Entry<String,Integer> entry:list.entrySet()) {
            if (entry.getValue()<201){
                product.add(entry.getKey());
            }
        }

        return product;
    }

    private static HashMap listAdd(HashMap<String,Integer> list) {
        list.put("Eggs",200);
        list.put("Milk",200);
        list.put("Fish",400);
        list.put("Apples",150);
        list.put("Bread",50);
        list.put("Chicken",550);
        return list;
    }
}
