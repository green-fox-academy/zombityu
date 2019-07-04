import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        listAdd(list);
        System.out.println("The price of the Fish: "+howMuchIsTheFish(list));
        System.out.println("The most expensive product: "+theMostExpensiveProduct(list));
        System.out.println("The average of the price: "+averagePrice(list));
        System.out.println(priceBelow(list)+" product is below 300.");
        System.out.println(isThereAnything(list));
        System.out.println("The cheapest product is: "+cheapestProduct(list));



    }

    private static String cheapestProduct(HashMap<String, Integer> list) {
        int min=(int)averagePrice(list);
        String cheapProduct="";
        for (Map.Entry<String,Integer> entry:list.entrySet()) {
            if (entry.getValue()<min){
                min=entry.getValue();
            }
        }
        for (Map.Entry<String,Integer> entry:list.entrySet()) {
            if (entry.getValue().equals(min)){
                cheapProduct=entry.getKey()+" The price is: "+entry.getValue();
            }
        }
        return cheapProduct ;
    }


    private static String isThereAnything(HashMap<String, Integer> list) {
        String answer = "No you haven't got enough money.";
        for (Map.Entry<String,Integer> entry:list.entrySet()) {
            if (entry.getValue()<125){
                answer="Yes you have enough money. You can buy some "+entry.getKey();
            }
        }

        return  answer;
    }

    private static int priceBelow(HashMap<String, Integer> list) {
        int counter=0;
        for (int below:list.values()) {
            if (below<300){
                counter++;
            }
        }
        return counter;
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
