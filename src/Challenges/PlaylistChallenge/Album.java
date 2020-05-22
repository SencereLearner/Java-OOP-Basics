package Challenges.PlaylistChallenge;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Album {
  public static void main(String[] args) {

  }
  private String name;
  private int age;

  public Album(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Student " + this.name + " of age " + this.age;
  }
}
