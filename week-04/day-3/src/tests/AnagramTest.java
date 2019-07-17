package tests;

import Anagram.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AnagramTest {

  Anagram anagramTest = new Anagram();

  @Test
  public void ShouldreturnTrue(){
   boolean actual = true;
   boolean expected = anagramTest.anagram("dog","god");
   assertEquals(actual,expected);
  }

  @Test
  public void ShouldreturnFalse(){
    boolean actual = true;
    boolean expected = anagramTest.anagram("dog","cat");
    assertNotEquals(actual,expected);
  }


}
