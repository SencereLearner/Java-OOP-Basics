package Challenges;

public class MultipleConstructorsChallenge {
  private String name;
  private int creditLimit;
  private String email;

  public MultipleConstructorsChallenge() {
    this("Krishna", 16000, "krishna@radha.com");
  }

  public MultipleConstructorsChallenge(String name, int creditLimit) {
    this(name, creditLimit, "krishna@rama.com");
  }

  public MultipleConstructorsChallenge(String name, int creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public int getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }
}
