package Challenges.ArrayChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    Integer [] initializedArray = getIntegers(5);
    printTheArrayContent(initializedArray);
    System.out.println("Descending order is: " + sortedInDescendingOrder(initializedArray));
  }

  public static Integer [] getIntegers(int arraySize) {
    Integer [] arr = new Integer[arraySize];
    System.out.println("Enter " + arraySize + " random numbers");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = input.nextInt();
    }
    return arr;
  }

  public static Integer [] printTheArrayContent(Integer [] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element " + i + ", typed value was " + array[i]);
    }
    return array;
  }

  public static String sortedInDescendingOrder (Integer[] array) {
    Integer[] finalArray = array;
    Arrays.sort(finalArray, Collections.reverseOrder());
    return Arrays.toString(finalArray);
  }
}
