package tests;

import fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

  Fibonacci fibon = new Fibonacci();

  @Test
  public void ShouldWriteFibonacciNumber(){
   int expected = 21;
   assertEquals(expected,fibon.fibonacciIndex(8));
  }
}
