import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLines {
    public static void main(String[] args) {
        String name = "István Vágási";
        String path = "my-file.txt";
        writeIntoFile(name,path);

        }

    private static void writeIntoFile(String name, String path) {
        List <String> list = new ArrayList<>();
        list.add(name);
        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, list);


        } catch (Exception e){
            System.out.println("Unable to write file: my-file.txt");
    }


    }
}

