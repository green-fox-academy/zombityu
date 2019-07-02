import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
        milk(shoppingList, "bread");
        milk(shoppingList, "banana");

    }

    private static void milk(ArrayList<String> array, String item) {
        if (array.contains(item)) {
            System.out.println("Yes, we have "+ item +" on the list.");
        }else {
            System.out.println("You dont't have "+item+"on your list.");
        }
    }
}
