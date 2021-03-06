package Interfaces;

public class MobilePhone implements ITelephone {

  private int myNumber;
  private boolean isRinging;
  private boolean isOn;

  public MobilePhone(int myNumber) {
    this.myNumber = myNumber;
  }

  @Override
  public void powerOn() {
    isOn = true;
    System.out.println("The phone is powered up");
  }

  @Override
  public void dial(int phoneNumber) {
    if (isOn) {
      System.out.println("Now ringing" + phoneNumber + " on mobile phone");
    }
    else {
      System.out.println("Turn the phone on to dial");
    }
  }

  @Override
  public void answer() {
    if (isRinging) {
      System.out.println("Answering desk phone");
      isRinging = false;
    }
  }

  @Override
  public boolean callPhone(int phoneNumber) {
    if (phoneNumber == myNumber && isOn) {
      isRinging = true;
      System.out.println("Ring, ring");
    } else {
      isRinging = false;
      System.out.println("Mobile phone is not on or number is different");
    }
    return isRinging;
  }

  @Override
  public boolean isRinging() {
    return isRinging;
  }
}