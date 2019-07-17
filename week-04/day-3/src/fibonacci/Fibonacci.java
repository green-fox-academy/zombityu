package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

  public int fibonacciIndex(int index){
//    if (index <= 1){
//
//      return index;
//    }else {
//
//     return fibonacciIndex(index-1)+fibonacciIndex(index-2);
//    }

    List<Integer> numbers = new ArrayList<>();
    numbers.add(0);
    numbers.add(1);
    for (int i = 2; i < index+1 ; i++) {
      numbers.add(numbers.get(i-1)+numbers.get(i-2));
    }
    return numbers.get(index);
  }
}
