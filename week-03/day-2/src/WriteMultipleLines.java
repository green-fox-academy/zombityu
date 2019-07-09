import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        String path = "my-file.txt";
        String word = "apple";
        int number= 4;
        multipleLinesFunction(path,word,number);

    }

    private static void multipleLinesFunction(String path, String word, int number) {
        List<String> list = new ArrayList<>();
        Path filePath = Paths.get(path);

        while(list.size() < number) {
            list.add(word);
        }
        try{
            Files.write(filePath,list);

        } catch(IOException e){
            System.out.println("Couldn't write the file.");
        }

    }
}
