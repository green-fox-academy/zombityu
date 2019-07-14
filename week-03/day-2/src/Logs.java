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
        List<String> logList = readData(filePath);
        System.out.println(ipAdresses(logList));
        System.out.println(getPostRatio(logList));
    }

    private static List<String> readData(Path filePath) {
            List<String> logList = new ArrayList<>();
        try {
            logList = Files.readAllLines(filePath);
        }catch(IOException e){
            System.out.println("Error!");
        }

        return logList;
    }

    private static double getPostRatio(List <String> logList) {

        int get = 0;
        double ratio = 0;
        int post = 0;
            for (int i = 0; i <logList.size(); i++) {
                if (logList.get(i).contains("GET")){
                    get++;
                } else {
                    post++;
                }
            }

        ratio = (double)get/post;
        return ratio;

    }

    private static Set<String> ipAdresses(List<String> logList) {
            ArrayList<String> newIpList = new ArrayList<>();

            for (int i = 0; i <logList.size() ; i++) {
                String pattern = "(\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}[.]\\d{1,3})";

                Pattern p = Pattern.compile(pattern);

                Matcher m = p.matcher(logList.get(i));
                if (m.find()) {
                    newIpList.add(m.group());
                }
            }

            Set<String> set = new HashSet<>(newIpList);
            System.out.println(set.size());

            return set;
    }

}
