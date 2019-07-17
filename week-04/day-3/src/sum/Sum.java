package sum;

import java.util.*;

public class Sum {

  List<Integer> numbers = new ArrayList<>();

  public Integer sum(List<Integer> numbers) {
    int sum = 0;

    if (numbers == null) {

      return null;

    } else {
      for (int i = 0; i < numbers.size(); i++) {
        sum += numbers.get(i);
      }
    }

    return sum;
  }
}
