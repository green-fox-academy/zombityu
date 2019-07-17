package count_letters;

import java.util.HashMap;

public class CountLetters {

  public HashMap<Character,Integer> countLetters(String word){
    HashMap<Character, Integer> letterMap = new HashMap<>();

    char [] charArray = word.toCharArray();
    for (char a:charArray) {
      if (!letterMap.containsKey(a)){
        letterMap.put(a,1);
      } else {
        letterMap.put(a,letterMap.get(a)+1);
      }
    }

    return letterMap;
  }
}
