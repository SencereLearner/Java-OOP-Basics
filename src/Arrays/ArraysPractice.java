package Arrays;
import java.util.Arrays;
import java.util.Collections;

public class ArraysPractice {

  public static void main(String[] args) {
    System.out.println(sortedInAscendingOrder());
    System.out.println(sortedInDescendingOrder());
  }

  public static int [] getValues () {
    int [] a = {3, 99, 2, 5, 6, 11, 5, 8};
    return a;
  }
  public static Integer[] getValues2 () {
    Integer [] a = {3, 99, 2, 5, 6, 11, 5, 8};
    return a;
  }

  public static String sortedInAscendingOrder () {
    int [] array = getValues();
    Arrays.sort(array);
    return Arrays.toString(array);
  }

  public static String sortedInDescendingOrder () {
    Integer[] array = getValues2();
    Arrays.sort(array, Collections.reverseOrder());
    return Arrays.toString(array);
  }
}
