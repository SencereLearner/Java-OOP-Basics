package com.company;

public class Car {

  private int doors;
  private int wheels;
  private String engine;
  private String colour;
  private String model;

  public void setModel (String model) {
    String validModel = model.toLowerCase();
    if (validModel.equals("Volgagrad") || validModel.equals("Carrera")) {
      this.model = model;
    }
    else {
      this.model = "Unknown";
    }
  }
  public String getModel () {
    return this.model;
  }
}
