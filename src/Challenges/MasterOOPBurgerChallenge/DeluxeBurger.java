package Challenges.MasterOOPBurgerChallenge;

public class DeluxeBurger extends BaseBurger {

  public DeluxeBurger() {
    super("Deluxe", "holland", 12, "Black");
    super.addAddition1("Chips", 1.5);
    super.addAddition2("Drink", 1.5);

  }

  @Override
  public void addAddition1(String name, double price) {
    System.out.println("Cant have any extras with the deluxe burger");
  }

  @Override
  public void addAddition2(String name, double price) {
    System.out.println("Cant have any extras with the deluxe burger");
  }

  @Override
  public void addAddition3(String name, double price) {
      System.out.println("Cant have any extras with the deluxe burger");
    }

  @Override
  public void addAddition4(String name, double price) {
    super.addAddition4(name, price);
    System.out.println("Cant have any extras with the deluxe burger");
  }
}
