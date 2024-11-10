package classwork_42_8_11.map_examples;

import java.util.HashMap;
import java.util.Map;

public class WorldsFrequencyAppl {
    public static void main(String[] args) {

        String[] words = {"a", "abc", "ab", "limit", "ab", "1a", "a", "ab", "limit", "a", "a", "a"};

        printWordFrequency (words);






    }

    private static void printWordFrequency(String[] words) {
        //Key - это само слово, value - это сколько раз оно попалось в массиве
        Map <String, Integer> resultMap = new HashMap<>();
        for (String word : words) {
          if (!resultMap.containsKey(word)){
          resultMap.put(word, 1);//1 - харкодим 1 - значение первый раз попалось
          } else {//когда слово такое уже есть в Map
              resultMap.put(word, resultMap.get(word)+1);//увеличили на единицу
          }
        }
        //printresultMap
        for (String word : resultMap.keySet()) {
            System.out.println("Word: " + word + ", frequency: " + resultMap.get(word));
        }
    }
}
