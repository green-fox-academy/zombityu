public class Factorio {
    public static void main(String[] args) {
        int myNumber = 0;
        factorio(myNumber);
        System.out.println(factorio(myNumber));
        
    }

    private static int  factorio(int num) {
        int fact = 1;
        for (int i = 1; i <=num ; i++) {
            fact *= i;
        }
        return fact;
    }
}
