package DELETE;

public class Two {
  private static int minValue = Integer.MAX_VALUE;
  private static int minValue2 = Integer.MAX_VALUE;
  private static int rowNumber;

  public static void main(String[] args) {
    int[][] r = {
            {9, 3, 4, 5},
            {5, 6, 7},
            {8, 1},
            {10}
    };
    //array(r);
    System.out.println("Min value of the array is: " + minArrayValue(r) + " and it's located in the row # " + getRowNumber(r));
  }


  private static void array (int[][] r) {
    for (int i = 0; i < r.length; i++) {
      int[] item = r[i];
      System.out.println("Row " + i + " length is = " + item.length);
      for (int j = 0; j < item.length; j++) {
        System.out.println("[" + i + "][" + j + "]" + " = " + r[i][j]);
      }
    }
  }

  private static int minArrayValue (int[][] r) {
    for (int i = 0; i < r.length; i++) {
      int[] item = r[i];
      for (int j = 0; j < item.length; j++) {
        if (minValue > r[i][j]) {
          minValue = r[i][j];
        }
      }
    }
    return minValue;
  }

  private static int getRowNumber (int[][] r) {
    for (int i = 0; i < r.length; i++) {
      int[] item = r[i];
      for (int j = 0; j < item.length; j++) {
        if (minValue2 > r[i][j]) {
          minValue2 = r[i][j];
          rowNumber = i;
        }
      }
    }
    return rowNumber;
  }


}

