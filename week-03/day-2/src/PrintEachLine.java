import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {


        try {
            Path filePath = Paths.get("my-file.txt");
            List <String> list = Files.readAllLines(filePath);
            System.out.println(list);
        }catch(IOException e){
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
