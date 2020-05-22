package Challenges.CompositionChallenge;

public class Bills {
  private String lightBillingCompanyName;
  private String gasBillingCompanyName;
  private String waterBillingCompanyName;

  private void logIntoBankAccount () {
    System.out.println("Logged into the bank account");
  }

  private void allocateFunds () {
    System.out.println("Funds have been allocated");
  }

  public void billPaid () {
    logIntoBankAccount();
    allocateFunds();
    System.out.println("Bills have been paid");
  }

  public Bills(String lightBillingCompanyName, String gasBillingCompanyName, String waterBillingCompanyName) {
    this.lightBillingCompanyName = lightBillingCompanyName;
    this.gasBillingCompanyName = gasBillingCompanyName;
    this.waterBillingCompanyName = waterBillingCompanyName;
  }

  public String getLightBillingCompanyName() {
    return lightBillingCompanyName;
  }

  public String getGasBillingCompanyName() {
    return gasBillingCompanyName;
  }

  public String getWaterBillingCompanyName() {
    return waterBillingCompanyName;
  }
}
