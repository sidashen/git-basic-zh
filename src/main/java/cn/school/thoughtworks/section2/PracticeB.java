package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
      Map<String, Integer> newMap = new HashMap<>();
      for (String element : collection1) {
        String mapElement = String.valueOf(element.charAt(0));
        int count = newMap.containsKey(mapElement) ? newMap.get(mapElement) : 0;
        if (element.length() != 1) {
          count = Integer.parseInt(String.valueOf(element.charAt(2)));
          newMap.put(mapElement, count);
          break;
        }
        newMap.put(mapElement, count + 1);
      }
    return newMap;
    }
}
