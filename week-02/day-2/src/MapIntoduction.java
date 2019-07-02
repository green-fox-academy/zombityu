import java.util.HashMap;

public class MapIntoduction {
    public static void main(String[] args) {

        HashMap<Integer,Character> newMap = new HashMap<>();
        System.out.println(newMap.size());
        System.out.println("------");
        newMap.put(97,'a');
        newMap.put(98,'b');
        newMap.put(99,'c');
        newMap.put(65,'A');
        newMap.put(66,'B');
        newMap.put(67,'C');
        System.out.println(newMap.keySet());
        System.out.println("------");
        System.out.println(newMap.values());
        newMap.put(68,'D');
        System.out.println("------");
        System.out.println(newMap.size());
        System.out.println("------");
        System.out.println(newMap.get(99));
        System.out.println("------");
        newMap.remove(97);
        System.out.println(newMap.equals(newMap.get(100)));
        newMap.clear();

    }
}
