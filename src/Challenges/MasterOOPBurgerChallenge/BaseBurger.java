package Challenges.MasterOOPBurgerChallenge;

public class BaseBurger {
  private String name;
  private String cheese;
  private double price;
  private String breadType;

  private String addition1Name;
  private double addition1Price;
  private String addition2Name;
  private double addition2Price;
  private String addition3Name;
  private double addition3Price;
  private String addition4Name;
  private double addition4Price;

  public BaseBurger(String name, String cheese, double price, String breadType) {
    this.name = name;
    this.cheese = cheese;
    this.price = price;
    this.breadType = breadType;
  }

  public void addAddition1 (String name, double price) {
    this.addition1Name = name;
    this.addition1Price = price;
  }
  public void addAddition2 (String name, double price) {
    this.addition2Name = name;
    this.addition2Price = price;
  }
  public void addAddition3 (String name, double price) {
    this.addition3Name = name;
    this.addition3Price = price;
  }
  public void addAddition4 (String name, double price) {
    this.addition4Name = name;
    this.addition4Price = price;
  }
  public double itemizedBurger () {
    double burgerPrice = this.price;

    if (this.addition1Name != null) {
      burgerPrice += this.addition1Price;
      System.out.println("Added " + this.addition1Name + " at the price of " + this.addition1Price
              + " and the total price for " + getClass().getSimpleName() + " is " + burgerPrice);
    }
    if (this.addition2Name != null) {
      burgerPrice += this.addition2Price;
      System.out.println("Added " + this.addition2Name + " at the price of " + this.addition2Price
              + " and the total price for " + getClass().getSimpleName() + " is " + burgerPrice);
    }
    if (this.addition3Name != null) {
      burgerPrice += this.addition3Price;
      System.out.println("Added " + this.addition3Name + " at the price of " + this.addition3Price
              + " and the total price for " + getClass().getSimpleName() + " is " + burgerPrice);
    }
    if (this.addition4Name != null) {
      burgerPrice += this.addition4Price;
      System.out.println("Added " + this.addition4Name + " at the price of " + this.addition4Price
              + " and the total price for " + getClass().getSimpleName() + " is " + burgerPrice);
    }
    return burgerPrice;
  }
}

