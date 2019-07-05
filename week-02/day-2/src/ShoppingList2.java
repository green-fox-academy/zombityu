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

        System.out.println("Bob pays: "+bobPays(listBob));
        System.out.println("Alice pays: "+alicePays(listAlice));
        System.out.println(whoBuysMoreRice(listAlice,listBob));
        whoBuysMorePotato(listAlice,listBob);





    }

    private static String whoBuysMorePotato(HashMap<String, Integer> listAlice, HashMap<String, Integer> listBob) {
        String whoP = "";
        


    }

    private static String whoBuysMoreRice(HashMap<String, Integer> listAlice, HashMap<String, Integer> listBob) {
        String who ="Alice is buy more rice.";
        int riceA = 0;
        int riceB = 0;
        for (Map.Entry<String,Integer>entryA:listAlice.entrySet()) {
            if (entryA.getKey().equals("Rice")){
                riceA = entryA.getValue();



            }
        }
        for (Map.Entry<String,Integer>entryB:listBob.entrySet()) {
            if (entryB.getKey().equals("Rice")){
                riceB = entryB.getValue();
            }
        }

        if (riceA<riceB){
            who = "Bob is buy more rice.";
        }

        return who;

    }

    private static int  alicePays(HashMap<String, Integer> listAlice) {
        int sumAlice = 0;
        for ( int a:listAlice.values() ) {
            sumAlice += a;
        }
        return sumAlice;
    }

    private static int bobPays(HashMap<String, Integer> listBob) {
        int sum = 0;
        for ( int a:listBob.values() ) {
            sum += a;
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
