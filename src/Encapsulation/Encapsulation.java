package Encapsulation;

public class Encapsulation {
  private int initialHealth = 200;

  public Encapsulation(int initialHealth) {
    if (initialHealth > 0 && initialHealth <= 100) {
      this.initialHealth = initialHealth;
    }
    else {
      System.out.println("Invalid value entered");
    }
  }
  public int getInitialHealth() {
    return initialHealth;
  }
}
