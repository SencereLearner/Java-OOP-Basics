package Challenges.ArrayListChallenge;

import java.util.ArrayList;

public class ArrayListPractice {
  private String name;
  private int age;

  public ArrayListPractice (String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public static void printAll (ArrayList<ArrayListPractice> arrayList) {
    for (int i = 0; i < arrayList.size(); i ++) {
      System.out.println("Element " + i + " = " + arrayList.get(i));
    }
  }

  public static void printAll2 (ArrayList<ArrayListPractice> arrayList) {
    for (ArrayListPractice temp : arrayList) {
      System.out.println("Students are: " + temp);
    }
  }

  @Override
  public String toString() {
    return "Student " + this.name + " of age " + this.age;
  }
}
//HOW DOES THIS TOSTRING METHOD GETS CALLED???