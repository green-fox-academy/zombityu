import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> telephone = new HashMap<>();
        telephone.put("Name(key)","Phone number(value)");
        telephone.put("William A. Lathan","405-709-1865");
        telephone.put("John K. Miller","402-247-8568");
        telephone.put("Hortensia E. Foster","606-481-6467");
        telephone.put("Amanda D. Newland","319-243-5613");
        telephone.put("Brooke P. Askew","307-687-2982");
        johnMiller(telephone);
        System.out.println(johnMiller(telephone));
        System.out.println(whosNumber(telephone));
    }

        private static String whosNumber(HashMap<String, String> map) {
            String whos = "";
            for (Map.Entry<String,String> entry:map.entrySet()) {
                if (entry.getValue().equals("307-687-2982")){
                    whos = entry.getKey();
                }
                
            }

        return whos;
    }

    private static String johnMiller(HashMap<String, String>map) {
        String john = "";
        for (String name:map.keySet()) {
            String value = map.get(name);
            if (name.equals("John K. Miller")){
                john = name+" "+value;
            }
        }

        return john;




    }
}
