package DELETE;

public class One {
  public static void main(String[] args) {

    int [][] arr = {
            {7, 8, 5},
            {9, 2, 13},
            {6, 11, 4}
    };
//    int min = Integer.MAX_VALUE;
//    int max = Integer.MIN_VALUE;
//    int column = 0;

//    for (int i = 0; i < arr.length; i ++) {
//      int [] item = arr[i];
//      for (int j = 0; j < item.length; j ++) {
//        if (min > arr[i][j]) {
//          min = arr[i][j];
//          column = j;
//          int [] allNumbers = arr[column];
//          for (int x = 0; x < allNumbers.length; x ++) {
//            if (max < allNumbers[x]) {
//              max = allNumbers[x];
//            }
//          }
//        }
//      }
//    }
//    System.out.println("The column index, which has the min number: " + column);

    int min = arr[0][0];
    int minColumn = 0;

    for (int i = 0; i < arr.length; i ++) {
      for (int j = 0; j < arr.length; j ++) {
        if (arr[i][j] < min) {
          min = arr[i][j];
          minColumn = j;
        }
      }
    }
    int k = 0;
    int max = arr[0][minColumn];

    while (k < 3) {
      if (arr[k][minColumn] > max) {
        max = arr[k][minColumn];
        k ++;
      }
    }
    System.out.println("The minimum number is: " + min);
    System.out.println("The maximum number is: " + max);
  }
}
