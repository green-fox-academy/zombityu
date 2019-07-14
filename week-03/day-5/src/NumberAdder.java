public class NumberAdder {
    public static void main(String[] args) {

        System.out.println(numberAdder(3,1));
        System.out.println(sumDigits(75,0));
        System.out.println(powerN(2,2));

    }

    public static int powerN(int base, int n) {
        if (n==1);
            return base;
        return base * powerN( base, n-1);

    }

    private static int sumDigits(int n,int sum) {
        if (n > 0){
            sum += n%10;
            n /= 10;
            return sumDigits(n,sum);
        }

        return sum;
    }

    private static int numberAdder(int n, int sum) {
        if (n > 1){
            sum +=n;
            n--;
            return numberAdder(n,sum);
        }else {
            return sum;
        }
    }


    }

