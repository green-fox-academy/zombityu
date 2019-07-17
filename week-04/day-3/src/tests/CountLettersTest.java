package tests;

import count_letters.CountLetters;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
  CountLetters letters = new CountLetters();

  @Test
  public void shouldWriteKeyValue(){
    HashMap<Character, Integer> testHashMap = new HashMap<>();
    testHashMap.put('a',1);
    testHashMap.put('p',2);
    testHashMap.put('l',1);
    testHashMap.put('e',1);
    assertEquals(testHashMap,letters.countLetters("apple"));
  }
}
