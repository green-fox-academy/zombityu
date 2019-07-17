package Anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

  public boolean anagram(String a1, String a2) {
    List<Character> charListA1 = new ArrayList<>();
    List<Character> charListA2 = new ArrayList<>();

    for (int i = 0; i <a1.length(); i++) {
      char a = a1.charAt(i);
      charListA1.add(a);
    }

    for (int i = 0; i <a2.length(); i++) {
      char b = a2.charAt(i);
      charListA2.add(b);
    }
    Collections.sort(charListA1);
    Collections.sort(charListA2);

    if (charListA1.equals(charListA2)){
      return true;
    }

    return false;
  }
}