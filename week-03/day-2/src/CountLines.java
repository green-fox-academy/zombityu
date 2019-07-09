import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        String fileName = "apple.txt";
        System.out.println(lineCounter(fileName));

    }

    private static int lineCounter(String fileName) {
        int lines = 0;
        try{
            Path filePath = Paths.get(fileName);
            List<String> list = Files.readAllLines(filePath);
            for (int i = 0; i <list.size(); i++) {
                lines++;
            }
        }catch(IOException e){
            System.out.println(lines);

        }

        return lines;
    }
}
