package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
      List<String> sameElementList = new ArrayList<>();
      List<String> listMap = new ArrayList<String>();
      for (String key : collection2.keySet()) {
        listMap = collection2.get(key);
      }
      for (String element1 : collection1) {
        for (String element2 : listMap) {
          if (element1.equals(element2)) {
            sameElementList.add(element1);
          }
        }
      }
    return sameElementList;
    }
}
