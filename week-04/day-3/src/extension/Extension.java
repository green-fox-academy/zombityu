package extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

  public int add(int a, int b) {
    return a+b;
  }

  public int maxOfThree(int a, int b, int c) {
    if (a > b && a > c){
      return a;
  } else if (c > a && c > b){
      return c;
  } else
    return b;
  }

  public double median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size()%2==0){
      return (double)(pool.get(pool.size()/2-1)+pool.get(pool.size()/2))/2;
    }

    return pool.get((pool.size()-1)/2);

  }

  public boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
  }

  public String translate(String hungarian) {
    List<Character> charList = new ArrayList<>();
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        charList.add(c);
        if (charList.contains(c)){
          teve = String.join(c + "v" + c, teve.split(""+c));
          charList.remove(i);
          i+=2;
          length+=2;

        }
      }
    }
    return teve;
  }
}

