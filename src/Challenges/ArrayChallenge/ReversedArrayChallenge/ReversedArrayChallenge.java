package Challenges.ArrayChallenge.ReversedArrayChallenge;

public class ReversedArrayChallenge {
  public static void main(String[] args) {
    int[] array = {5, 7, 9, 11, 59, 100, 897};
    reverse(array);
  }

  public static void reverse(int[] arr) {

    for (int j= 0; j < arr.length; j ++) {
      System.out.println("Element " + j + " = " + arr[j]);
    }
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println("Element [" + i + "] = " + arr[i]);

    }
  }
}
