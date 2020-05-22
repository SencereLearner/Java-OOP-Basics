package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList {
  public static void main(String[] args) {

    java.util.LinkedList<String> placesToVisit = new java.util.LinkedList<>();

    addInOrder(placesToVisit, "Sydney");
    addInOrder(placesToVisit, "Melbourne");
    addInOrder(placesToVisit, "Brisbane");
    addInOrder(placesToVisit, "Perth");
    addInOrder(placesToVisit, "Darwin");
    addInOrder(placesToVisit, "Canberra");
    addInOrder(placesToVisit, "Adelaide");
    addInOrder(placesToVisit, "Darwin");

    printList(placesToVisit);

    visit(placesToVisit);
  }

  private static void printList(java.util.LinkedList<String> linkedList) {
    Iterator<String> i = linkedList.iterator();
    while (i.hasNext()) {
      System.out.println("Places to visit are --> " + i.next());
    }
    System.out.println("========================");
  }

  private static boolean addInOrder (java.util.LinkedList<String> linkedList, String newCity) {
    ListIterator<String> stringListIterator = linkedList.listIterator();
    while (stringListIterator.hasNext()) {//moves to the next value
      int comparison = stringListIterator.next().compareTo(newCity);//if exists int = 0, if not int = 1
      if (comparison == 0) {//meaning the city is on the list already
        System.out.println(newCity + " is already included as a destination");
        return false;//return false and do nothing
      }
      else if (comparison > 0) {//meaning the city is not on the list yet
        //new city should appear before this one like Brisbane -> Adelaide
          stringListIterator.previous();
          stringListIterator.add(newCity);
        System.out.println(newCity + " is being included as a destination");
        return true;
      }
      else if (comparison < 0 ) {
        //move on next city
      }
    }
    stringListIterator.add(newCity);
    return true;
  }

  private static void visit (java.util.LinkedList cities) {
    Scanner input = new Scanner(System.in);
    boolean quit = false;
    ListIterator listIterator = cities.listIterator();
    if (cities.isEmpty()) {
      System.out.println("No cities in the iterator");
      return;
    }
    else {
      System.out.println("Now visiting " + listIterator.next());
      printMenu();
    }
    while (!quit) {
      int action = input.nextInt();
      input.nextLine();
      switch (action) {
        case 0:
          System.out.println("Holiday (Vacation) over");
          quit = true;
          break;
        case 1:
          if (listIterator.hasNext()) {
            System.out.println("Now visiting " + listIterator.next());
          }
          else {
            System.out.println("Reached the end of the list");
          }
          break;
        case 2:
          if (listIterator.hasPrevious()) {
            System.out.println("Now visiting " + listIterator.previous());
          }
          else {
            System.out.println("We are at the start of the list");
          }
          break;
        case 3:
          printMenu();
          break;
      }
    }
  }
  private static void printMenu () {
    System.out.println("Available actions: \npress");
    System.out.println("0 - to quit\n" +
            "1 - go to next city\n" +
            "2 - go to previous city\n" +
            "3 - print menu options");
  }
}
