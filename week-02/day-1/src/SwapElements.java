import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        String swap="";
        String [] abc = { "first", "second", "third" };
        swap = abc[0];
        abc[0] = abc[2];
        abc [2] = swap;
        System.out.println(Arrays.toString(abc));
    }
}
