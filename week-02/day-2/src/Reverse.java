import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        reverse(reversed);
        System.out.println(reverse(reversed));
    }

    private static StringBuilder reverse(String reversed) {

        StringBuilder reversed1 = new StringBuilder();
        reversed1.append(reversed);


        return reversed1.reverse();
    }

//    private static void reverse(String line) {
////        String reversed = "";
//        char[] reversed = line.toCharArray();
//        for (int i = reversed.length-1; i >= 0; i--) {
//            System.out.print(reversed[i]);

//        }

//    }

}