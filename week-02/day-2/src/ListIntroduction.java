import java.util.ArrayList;

public class ListIntroduction {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        System.out.println("------");
        names.add("William");
        System.out.println(names);
        System.out.println("------");
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println("------");
        System.out.println(names.get(2));
        System.out.println("------");
        int a = 1;
        for (int i = 0; i <names.size() ; i++) {
            System.out.println(a+"."+names.get(i));
            a++;
        }
        System.out.println("------");
        names.remove(1);
        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));
        }
        System.out.println("------");

        for (int i =names.size()-1; i >=0 ; i--) {
            System.out.println(names.get(i));
        }

        names.clear();
    }
}
