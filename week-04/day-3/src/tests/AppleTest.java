package tests;

import apples.Apple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppleTest {
  Apple newpple = new Apple();

  @Test
  public void shouldReturnApple(){
    String expected = "apple";
    String actual = newpple.getApple();
    assertEquals(expected,actual);

  }

  @Test
  public void notReturnApple(){
    String expected = "melon";
    String actual = newpple.getApple();
    assertNotEquals(expected,actual);


  }
}
