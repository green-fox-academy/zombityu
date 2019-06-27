import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many girls coming to the party: ");
        int girl = scan.nextInt();
        System.out.println("How many boys coming to the party: ");
        int boy = scan.nextInt();
        int sum = boy+girl;

        if (boy == girl && sum >= 20 ){
            System.out.println("Party is excellent.");
        }else if(sum >= 20 && (boy < girl || girl < boy ) ){
            System.out.println("Quite cool party");
        }else if ( sum < 20 && girl>0 ){
            System.out.println("Average party");
        }else if (girl == 0 ) {
            System.out.println("Sausage party");
        }
    }

}
