import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> newMap = new HashMap<>();
        newMap.put("978-1-60309-452-8" , "A Letter to Jo");
        newMap.put("978-1-60309-459-7" , "Lupus");
        newMap.put("978-1-60309-444-3" , "Red Panda and Moon Bear");
        newMap.put("978-1-60309-461-0" , "The Lab");

//        newMap.forEach((key, value) -> System.out.println(value + " ( ISBN: " + key+" )"));

        for (String name:newMap.keySet()) {
            String key = name;
            String value = newMap.get(name);
            System.out.println(value+" ( ISBN:"+key+" )");
            
        }

        newMap.remove("978-1-60309-444-3");

//        newMap.values().remove("The Lab");

        for (Map.Entry<String, String> e:newMap.entrySet()){

            if (e.getValue() == "The Lab"){
                newMap.remove(e.getKey());
                break;
            }
        }

        newMap.put("978-1-60309-450-4", "They Called Us Enemy");
        newMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(newMap.keySet().contains("478-0-61159-424-8"));

        System.out.println(newMap.get("978-1-60309-453-5"));


    }
}
