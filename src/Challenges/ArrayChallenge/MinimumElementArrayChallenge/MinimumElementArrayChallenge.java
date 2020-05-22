package Challenges.ArrayChallenge.MinimumElementArrayChallenge;
import org.omg.CORBA.INTERNAL;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementArrayChallenge {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int [] arrayResult = readIntegers(5);
    System.out.println("The minimum value of the array is: " + findMin(arrayResult));
  }

  public static int [] readIntegers (int count) {
    System.out.println("Enter " + count + " random numbers");
    int [] array = new int[count];
    for (int i = 0; i < array.length; i ++) {
      array [i] = input.nextInt();
    }
      System.out.println("Each array element is: " + Arrays.toString(array));
    return array;
  }

  public static int findMin (int [] minArray) {
//    Arrays.sort(minArray);
//    return minArray [0];
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < minArray.length; i ++) {
      int value = minArray[i];
      if (min > value) {
        min = value;
      }
    }
    return min;
  }

}
