package Reflections;

import java.lang.reflect.Method;

public class AnotherReflectionsClass {
  public static void main(String[] args) {

    AnotherReflectionsClass mainClass = new AnotherReflectionsClass();
    Reflections ref = new Reflections();
    Class cl = ref.getClass();
    Class classOne = mainClass.getClass();
    Method[] allMethods = classOne.getDeclaredMethods();

    //print the class name
    System.out.println(cl.getSimpleName());
    //counting total methods in the class and printing out each method's name or name and signature of the class
    Method[] methods = cl.getDeclaredMethods();
    System.out.println("Total methods: " + methods.length);//count of methods
    for (Method temp : methods) {
      System.out.println("Each method: " + temp.getName());//name only
      System.out.println("Each method: " + temp);//name and sign
      System.out.println("Each method: " + temp + " and return type is: " + temp.getReturnType());//name and return type
    }
    for (Method method : methods) {

    }

  }
}
