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

        System.out.println("The sum of the expense "+spend(expens));
        System.out.println("The greatest "+greatest(expens));
        System.out.println("Cheapest: "+cheapest(expens));
        System.out.println("The average: "+average(expens));


       System.out.println(expens);
    }

    private static float average(ArrayList<Integer> array) {
        int count = 0;
        int sum = 0;
        for (int av:array) {
            sum += av;
            count++;

        }
        float average = (float)sum/count;
        return average;
    }

    private static int cheapest(ArrayList<Integer> array) {
        int a = array.get(0);
        for (int i = 0; i <array.size() ; i++) {
            if (a>array.get(i)){
               a = array.get(i);
            }

        }
        return a;

    }

    private static int  greatest(ArrayList<Integer> array) {
        int n = 0;
        for (int b:array) {
            if (n<b){
                n=b;
            }
        }
        return n;



    }

    private static int spend(ArrayList <Integer> array) {
        int sum = 0;
        for (int s:array) {
            sum += s;
        }
        return sum;
        }
        
        
    }


