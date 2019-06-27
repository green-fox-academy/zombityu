public class SecondsInADay {

    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int sumSeconds = (int)(currentHours*Math.pow(60,2)+currentMinutes*60+currentSeconds);
        int daysecond = (int)(24*Math.pow(60,2)) ;

        int remainigSecond = daysecond-sumSeconds;

        System.out.println(remainigSecond);

    }




}
