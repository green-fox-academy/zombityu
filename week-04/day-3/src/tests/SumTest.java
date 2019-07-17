package tests;

import org.junit.jupiter.api.Test;
import sum.Sum;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
  Sum sumClass = new Sum();

  @Test
  public void shouldSumTheElements(){
    List<Integer> nums = new ArrayList<>();
    nums.add(5);
    nums.add(2);
   int expected = 7;
   int actual = sumClass.sum(nums);
   assertEquals(expected,actual);
  }

  @Test
  public void shouldAddEmptyList(){
    List<Integer> nums = new ArrayList<>();
    int expected = 0;
    int actual = sumClass.sum(nums);
    assertEquals(expected,actual);
  }

  @Test
  public void shouldReadOneElement(){
    List<Integer> nums = new ArrayList<>();
    nums.add(5);
    int expected = 5;
    int actual = sumClass.sum(nums);
    assertEquals(expected,actual);
  }

  @Test
  public void shouldReadNull(){
    Integer expected = null;
    Integer actual = sumClass.sum(null);
    assertEquals(expected,actual);
  }


}
