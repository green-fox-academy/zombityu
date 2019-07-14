import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Births {
  public static void main(String[] args) {

    List <String> fileContent = readFile("D:\\GreenFox\\zombityu\\week-03\\day-2\\src\\birth.csv");
    List <Integer> birthYears = parseBirthDate(fileContent);
    Map<Integer, Integer> yearFrequency = birthYearFrequency(birthYears);
    System.out.println("The most birth happens in: "+findTheMostCommon(yearFrequency));

  }

  private static int findTheMostCommon(Map<Integer, Integer> yearFrequency) {
    int max = 0;
    int year = 0;

    for (Map.Entry<Integer, Integer> years:yearFrequency.entrySet()) {
      if (max < years.getValue()){
        max = years.getValue();
        year = years.getKey();
      }
    }

    return year;
  }

  private static Map<Integer, Integer> birthYearFrequency(List<Integer> birthYears) {
    Map<Integer, Integer> yearFrequency = new HashMap<>();

    for (int year:birthYears) {
      if (!yearFrequency.containsKey(year)){
        yearFrequency.put(year,1);
      } else {
        yearFrequency.put(year,yearFrequency.get(year)+1);
      }
    }

    return yearFrequency;
  }

  private static ArrayList<Integer> parseBirthDate(List<String> fileContent) {
    ArrayList <Integer> birthDate = new ArrayList<>();

    for (String line:fileContent) {
      String [] lineContent = line.split(";");
      birthDate.add(Integer.parseInt(lineContent[1].substring(0,4)));

    }

    return birthDate;
  }

  private static List<String> readFile(String path) {
    Path filePath = Paths.get(path);

    try {
      return Files.readAllLines(filePath);
    }catch (IOException e){
      return new ArrayList<>();
    }
  }

}
