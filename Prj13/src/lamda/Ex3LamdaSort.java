package lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex3LamdaSort {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("ccc");
    list.add("bbb");
    /* 
    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    });
    */
    Collections.sort(list, (o1, o2)-> o2.compareTo(o1));
    System.out.println(list);
  }
}
