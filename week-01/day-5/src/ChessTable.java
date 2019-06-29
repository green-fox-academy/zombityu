import java.util.Scanner;

public class ChessTable {
    public static void main(String[] args) {

        //--->Add the input<------
        Scanner scan = new Scanner(System.in);
        System.out.println("Add the chess table size: ");
        int a = scan.nextInt();

        for (int i = 0; i <a; i++) {
            for (int j = 0; j <a; j++) {

                if (i%2==0 && j%2==0){
                    System.out.print("%");
                }else if (i%2==1 && j%2==1){
                    System.out.print("%");
                }else
                    System.out.print(" ");

            }
            System.out.println();
        }





        }
    }

