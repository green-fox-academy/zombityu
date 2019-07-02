import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> telephone = new HashMap<>();
        telephone.put("Name(key)","Phone number(value)");
        telephone.put("William A. Lathan","405-709-1865");
        telephone.put("John K. Miller","402-247-8568");
        telephone.put("Hortensia E. Foster","606-481-6467");
        telephone.put("Amanda D. Newland","319-243-5613");
        telephone.put("Brooke P. Askew","Brooke P. Askew");
        johnMiller(telephone);
        System.out.println(johnMiller(telephone));
//        whosNumber();
    }

//    private static String whosNumber(HashMap<String, String> map) {
//
//        return ;
//    }

    private static String johnMiller(HashMap<String, String>map) {
        String john = "";
        for (String name:map.keySet()) {
            String key = name;
            String value = map.get(name);
            if (key.equals("John K. Miller")){
                john = key+" "+value;
            }
        }

        return john;




    }
}
