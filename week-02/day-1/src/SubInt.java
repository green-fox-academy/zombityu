import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
    }



    private static ArrayList subInt(Integer a, int [] array) {
        ArrayList<String> list = new ArrayList<>();
        Arrays.toString(array);
        String aa = "";
        for (int i = 0; i <array.length; i++) {
            aa = Integer.toString(array[i]);
            if (aa.contains(Integer.toString(a))){
                list.add(Integer.toString(i));
            }
    }
        return list;
    }

}