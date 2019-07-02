import java.util.ArrayList;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> expens = new ArrayList<>();
        expens.add(500);
        expens.add(1000);
        expens.add(1250);
        expens.add(175);
        expens.add(800);
        expens.add(120);

        spend(expens);
        greatest(expens);
        cheapest(expens);
        average(expens);


       System.out.println(expens);
    }

    private static void average(ArrayList<Integer> array) {
        int count = 0;
        int sum = 0;
        for (int av:array) {
            sum += av;
            count++;


        }
        System.out.println((float)sum/count);

    }

    private static void cheapest(ArrayList<Integer> array) {
        int a = 0;
        for (int i = 0; i <array.size() ; i++) {
            if (array.get(0)>array.get(i)){
               a = array.get(i);
            }

        }
        System.out.println(a);

    }

    private static void greatest(ArrayList<Integer> array) {
        int n = 0;
        for (int b:array) {
            if (n<b){
                n=b;
            }
        }
        System.out.println(n);



    }

    private static void spend(ArrayList <Integer> array) {
        int sum = 0;
        for (int s:array) {
            sum += s;
        }
        System.out.println(sum);
        }
        
        
    }


