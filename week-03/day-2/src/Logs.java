import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logs {
    public static void main(String[] args) {


        Path filePath = Paths.get("D:\\GreenFox\\zombityu\\week-03\\day-2\\log.txt");
        ipAdresses(filePath);
        System.out.println(getPostRatio(filePath));
    }

    private static double getPostRatio(Path filePath) {

        int get = 0;
        double ratio = 0;
        try {
            List<String> logList = Files.readAllLines(filePath);
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

    private static void ipAdresses(Path filePath) {
        try {
            List<String> logList = Files.readAllLines(filePath);
            ArrayList<String> ipList = new ArrayList<>();

            for (int i = 0; i <logList.size() ; i++) {
                String pattern = "(\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}[.]\\d{1,3})";

                Pattern p = Pattern.compile(pattern);

                Matcher m = p.matcher(logList.get(i));
                if (m.find()) {
                    ipList.add(m.group());
                }
            }

            Set<String> set = new HashSet<>(ipList);
            System.out.println(set);
            System.out.println(set.size());


        } catch (IOException e) {
            System.out.println("Error");
        }


    }


}
