import java.util.*;

public class Exercise3 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);


    numbers.parallelStream()
            .map(num -> (int)Math.pow(num,2))
            .filter(num -> num > 20)
            .forEach(System.out::println);

  }
}
