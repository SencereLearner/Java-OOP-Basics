package com.company;

import java.util.ArrayList;

class IntClass {
  public static int myValue;

  public IntClass(int myValue) {
    this.myValue = myValue;
  }

  static public int getMyValue() {
    return myValue;
  }

  public void setMyValue(int myValue) {
    this.myValue = myValue;
  }
}

class AutoboxingAndInboxing {
  public static void main(String[] args) {

    Integer in = 54; //same as Integer i = Integer.valueOf(50);

    ArrayList<Double> doubles = new ArrayList<>();

    for (double d = 0.0; d <= 10; d += 0.5) {
      doubles.add(Double.valueOf(d));//boxing
    }

    for (int i = 0; i < doubles.size(); i ++) {
      double value = doubles.get(i).doubleValue();//unboxing
      System.out.println(i + " --> " + value);
    }

  }
}



