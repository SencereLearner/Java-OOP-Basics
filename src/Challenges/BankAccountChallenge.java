package Challenges;

public class BankAccountChallenge {
  private String accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  public BankAccountChallenge() {
    this("12345", 0, "Name", "email.com", "847-444-3212");
  }
  public BankAccountChallenge (String accountNumber, double balance, String customerName, String email, String phoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this. phoneNumber = phoneNumber;
  }
  public BankAccountChallenge(double balance, String email, String phoneNumber) {
    this("12345AccountNumber", balance, "Krishna", email, phoneNumber);
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public double addFunds (double funds) {
    return this.balance += funds;
  }
  public double deductFunds (double funds) {
    if (balance < funds) {
      System.out.println("Insufficient funds!");
      System.exit(0);
    }
    return this.balance -= funds;
  }

  public double fundsCount (double funds) {
    return funds;
  }

}
