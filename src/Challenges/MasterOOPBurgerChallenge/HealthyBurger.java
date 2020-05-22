package Challenges.MasterOOPBurgerChallenge;

public class HealthyBurger extends BaseBurger {
  private String additionExtra1Name;
  private double additionExtra1Price;
  private String additionExtra2Name;
  private double additionExtra2Price;

  public HealthyBurger(String cheese, double price) {
    super("Healthy Burger", cheese, price, "Brown Rye");
  }

  public void addHealthyExtraAddition1 (String name, double price) {
    this.additionExtra1Name = name;
    this.additionExtra1Price = price;
  }
  public void addHealthyExtraAddition2 (String name, double price) {
    this.additionExtra2Name = name;
    this.additionExtra2Price = price;
  }

  @Override
  public double itemizedBurger() {
    double healthyBurgerPrice = super.itemizedBurger();

    if (this.additionExtra1Name != null) {
      healthyBurgerPrice += this.additionExtra1Price;
      System.out.println("Added " + this.additionExtra1Name + " for an extra " + this.additionExtra1Price);
    }
    if (this.additionExtra2Name != null) {
      healthyBurgerPrice += this.additionExtra1Price;
      System.out.println("Added " + this.additionExtra2Name + " for an extra " + this.additionExtra2Price);
    }
    return healthyBurgerPrice;
  }
  }
