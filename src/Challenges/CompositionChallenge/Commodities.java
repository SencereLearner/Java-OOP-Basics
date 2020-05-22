package Challenges.CompositionChallenge;

public class Commodities {
  String gasType;
  String lightType;
  private int lamps;
  private Bills bills;

  public Commodities(String gasType, String lightType, int lamps, Bills bills) {
    this.gasType = gasType;
    this.lightType = lightType;
    this.lamps = lamps;
    this.bills = bills;
  }

  public void lightOn () {
    System.out.println("The light is on");
  }

  public void lightOff () {
    System.out.println("The light is off");
  }

  public String getGasType() {
    return gasType;
  }

  public String getLightType() {
    return lightType;
  }

  public int getLamps() {
    return lamps;
  }

  public Bills getBills() {
    return bills;
  }



}
