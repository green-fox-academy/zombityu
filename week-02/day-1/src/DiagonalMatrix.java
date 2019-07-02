import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add a number");
        int addNum = scan.nextInt();
        int [][] matrix = new int [addNum][addNum];


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column <matrix[row].length ; column++) {
                if (matrix[row]==matrix[column]){
                    matrix[row][column]=1;
                    System.out.print(matrix[row][column]);
                } else {
                    System.out.print(matrix[row][column]);
                }
            }
            System.out.println();
        }


}
}
