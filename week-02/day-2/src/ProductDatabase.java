import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        listAdd(list);
        System.out.println("The price of the Fish: "+howMuchIsTheFish(list));
        System.out.println("The most expensive product: "+theMostExpensiveProduct(list));
        System.out.println("The average of the price: "+averagePrice(list));



    }

    private static float averagePrice(HashMap<String, Integer> list) {
        int average = 0;
        for (int avg:list.values()) {
            average+=avg;
        }
        float averageNew = (float)average/list.values().size();
        return averageNew;
    }

    private static String theMostExpensiveProduct(HashMap<String, Integer> list) {
        int expensiveProduct = 0;
        String product = "";
        for (int exp:list.values()) {
            if (exp > expensiveProduct){
                expensiveProduct = exp;
            }
        }
        for (Map.Entry<String,Integer> entry:list.entrySet()) {
            if (entry.getValue().equals(expensiveProduct)){
                product=entry.getKey();
            }
        }

        return  product;
    }

    private static int howMuchIsTheFish(HashMap<String, Integer> list) {
        int fishPrice = 0;
        for (Map.Entry<String,Integer> entry:list.entrySet()) {
            if (entry.getKey().equals("Fish")){
                fishPrice=entry.getValue();
            }
        }
        return fishPrice;
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
