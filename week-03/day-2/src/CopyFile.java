import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String copyFrom = "D:\\GreenFox\\zombityu\\week-03\\day-2\\my-file.txt";
        String copyTo = "D:\\GreenFox\\zombityu\\week-03\\day-2\\apple.txt";

        System.out.println(copyFile(copyFrom, copyTo));

    }

    private static boolean copyFile(String copyFrom, String copyTo) {

        try {
            Path filePathFrom = Paths.get(copyFrom);
            Path filePathTo = Paths.get(copyTo);
            List<String> list = Files.readAllLines(filePathFrom);
            Files.write(filePathTo, list);

            return true;

        } catch (IOException e) {
            System.out.println("Error");
        }
        return false;
    }
}