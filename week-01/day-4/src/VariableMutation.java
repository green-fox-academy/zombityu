public class VariableMutation {

    public static void main(String[] args) {


        int a = 3;
        a += 10;

        System.out.println(a);

        int b = 100;
        b-=7;

        System.out.println(b);

        int c = 44;
        c *= 2;

        System.out.println(c);

        int d = 125;
        d /= 5;

        System.out.println(d);

        int e = 8;
        e *= e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean bool = f1 > f2 ;
        System.out.println(bool);

        int g1 = 350;
        int g2 = 200;
        boolean gbool = 2*g2 > g1 ;
        System.out.println(gbool);

        int h1 = 135798745;
        boolean hbool = h1 % 11 == 0 ;
        System.out.println(hbool);

        int i1 = 10 ;
        int i2 = 3;
        System.out.println(i1 > Math.pow(i2,2) && i1 < Math.pow(i2,2));

        int j = 1521;
        System.out.println( 1521%3==0 ||1521%5==0 );


    }

}
