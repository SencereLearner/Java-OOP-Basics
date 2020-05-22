package Collections;
import java.util.*;

public class ClassOne {
  public static void main(String[] args) {


//    ArrayList<String> a = new ArrayList<String>();
//    a.add("String");
//    a.add("String2");
//    a.add("String3");
//    a.add("String3");
//    System.out.println(a);
//    System.out.println();
//    HashSet<String> h = new HashSet<>();
//    h.add("String");
//    h.add("String2");
//    h.add("String3");
//    h.add("String3");
//    System.out.println(h);
//    System.out.println();
//    Set<String> s = new HashSet<>();
//    s.add("String");
//    s.add("String2");
//    s.add("String3");
//    s.add("String3");
//    System.out.println(s);
    HashMap<String, String> map = new HashMap<>();
    map.put("One", "ONE");
    map.put("two", "TWO");
    map.put("Three", "THREE");
    Set<String> values = map.keySet();
    for (String temp: values) {
      System.out.println("Value " + temp);
    }
  }
}
