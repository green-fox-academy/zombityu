import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logs {
    public static void main(String[] args) {

        String file = "D:\\GreenFox\\zombityu\\week-03\\day-2\\log.txt";

        ipAdresses(file);
        System.out.println(getPostRatio(file));




    }

    private static double getPostRatio(String file) {

        int get = 0;
        double ratio = 0;

        try {
            Path filePath = Paths.get(file);
            List<String> logList = Files.readAllLines(filePath);
            System.out.println(logList);

            for (int i = 0; i <logList.size(); i++) {
                if (logList.get(i).contains("GET")){
                    get++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        ratio = (double)get *100 / 500;
        return ratio;


    }




    private static void ipAdresses(String file) {
        try {
            Path filePath = Paths.get(file);
            List<String> logList = Files.readAllLines(filePath);

            ArrayList<String> ips = new ArrayList<>();


            for (int i = 0; i < logList.size(); i++) {
                String pattern = "(\\\\d{1,3}[.]\\\\d{1,3}[.]\\\\d{1,3}[.]\\\\d{1,3})";

                Pattern p = Pattern.compile(pattern);

                Matcher m = p.matcher(logList.get(i));

                if (m.find()){
                    ips.add(m.group());
                }

            }
            Set<String> set = new HashSet<>(ips);
            System.out.println(set);

        } catch (IOException e) {
            System.out.println("Error");
        }


    }


}
