import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap <String, Double> mainList = new HashMap<>();
        HashMap<String, Integer> listAlice= new HashMap<>();
        HashMap<String, Integer> listBob= new HashMap<>();

        mainListFill(mainList);
        listBob(listBob);
        listAlice(listAlice);

        System.out.println("Bob pays: " + sumPays(listBob,mainList));
        System.out.println("Alice pays: " + sumPays(listAlice,mainList));
        System.out.println(whoBuysMore(listAlice,listBob,"Rice"));
        System.out.println(whoBuysMore(listAlice,listBob,"Potato"));
        System.out.println(differentProduct(listAlice,listBob));
        System.out.println(moreProduct(listAlice,listBob));


    }

    private static String moreProduct(HashMap<String, Integer> listAlice, HashMap<String, Integer> listBob) {
        int sumAlice = 0;
        int sumBob = 0;

        for (int a:listAlice.values()){
            sumAlice+=a;
        }

        for (int b:listBob.values()) {
            sumBob+=b;
        }

        if (sumAlice<sumBob){
            return "Bob Has more product";
        }
        return "Alice has more product" ;
    }

    private static String differentProduct(HashMap<String, Integer> listAlice, HashMap<String, Integer> listBob) {
        if (listBob.size()<listAlice.size()){
            return "Alica has more different kind of product";
        }

        return "Bob has more different kind of product.";
    }




    private static String whoBuysMore(HashMap<String, Integer> listAlice, HashMap<String, Integer> listBob, String product) {
        int riceA = 0;
        int riceB = 0;
        for (Map.Entry<String,Integer>entryA:listAlice.entrySet()) {
            if (entryA.getKey().equals(product)){
                riceA = entryA.getValue();

            }
        }
        for (Map.Entry<String,Integer>entryB:listBob.entrySet()) {
            if (entryB.getKey().equals(product)){
                riceB = entryB.getValue();
            }
        }

        if (riceA<riceB){
            return "Bob buy more "+product;
        }

        return "Alice buy more "+product;

    }

    private static float sumPays(HashMap<String, Integer> shoppingList, HashMap<String, Double> priceList) {
        float sum = 0;
        for (Map.Entry<String,Double>entryMain:priceList.entrySet()) {
            for (Map.Entry<String,Integer>entryB:shoppingList.entrySet()) {
                if (entryMain.getKey().equals(entryB.getKey())){
                    sum += entryMain.getValue()*entryB.getValue();
                }
            }
        }

        return sum;
    }

    private static HashMap listAlice(HashMap<String, Integer> listAlice) {
        listAlice.put("Tomato",10);
        listAlice.put("Rice",1);
        listAlice.put("Eggs",5);
        listAlice.put("Apples",1);
        listAlice.put("Chicken Breasts",2);
        return listAlice;

    }

    private static HashMap listBob(HashMap<String, Integer> listBob) {
        listBob.put("Milk",3);
        listBob.put("Rice",2);
        listBob.put("Eggs",2);
        listBob.put("Cheese",1);
        listBob.put("Chicken Breasts",4);
        listBob.put("Apples",1);
        listBob.put("Tomato",2);
        listBob.put("Potato",1);
        return listBob;
    }

    private static HashMap mainListFill(HashMap<String, Double> mainList) {
        mainList.put("Milk", 1.07);
        mainList.put("Rice", 1.59);
        mainList.put("Eggs", 3.14);
        mainList.put("Cheese", 12.60);
        mainList.put("Chicken Breasts", 9.40);
        mainList.put("Apples", 2.31);
        mainList.put("Tomato", 2.58);
        mainList.put("Potato", 1.75);
        mainList.put("Onion", 1.10);

        return mainList;
    }
}
