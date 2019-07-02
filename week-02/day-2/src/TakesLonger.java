public class TakesLonger {

    public static void main(String[] args) {
       String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
       quote =quote.replace(quote.substring(quote.indexOf("It"), quote.indexOf("you")), "It always takes longer than ");
        System.out.println(quote);

    }
}
