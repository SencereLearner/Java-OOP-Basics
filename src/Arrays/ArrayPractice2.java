package Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice2 {
  public static void main(String[] args) {
//    int [] a = new int[5];
//    int [] b = a;
//
//    System.out.println(Arrays.toString(a));
//    System.out.println(Arrays.toString(b));
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");

    while (!input.hasNextInt()) {
      System.out.println("NEED A NUMBER");
      input.next();
    }
    System.out.println("Done");
  }
}



