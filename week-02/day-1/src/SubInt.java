import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        subInt(1, new int[]{1, 11, 34, 52, 61});
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
    }

    private static ArrayList subInt(Integer a, int [] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            if (list.contains(a)){
                list.add(array[i]);
            }
        }
        return list;

    }


}