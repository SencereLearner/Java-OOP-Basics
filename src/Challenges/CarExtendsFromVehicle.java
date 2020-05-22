package Challenges;

public class CarExtendsFromVehicle extends Vehicle {

  private int wheels;
  private int doors;
  private int gears;
  private boolean isManual;
  private int currentGear;

  public CarExtendsFromVehicle(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
    super(name, size);
    this.wheels = wheels;
    this.doors = doors;
    this.gears = gears;
    this.isManual = isManual;
    this.currentGear = 1;
  }

  public void changeGear (int currentGear) {
    this.currentGear = currentGear;
    System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear");
  }

  public void changeVelocity (int speed, int direction) {
    move(speed, direction);
    System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
  }



//  private int doors;
//  private int wheels;
//  private double enginePower;
//
//  public CarExtendsFromVehicle(int weight, int size, String color, String bodyType, int doors, int wheels, double enginePower) {
//    super(weight, size, color, bodyType);
//    this.doors = doors;
//    this.wheels = wheels;
//    this.enginePower = enginePower;
//  }
//
//  public String changingGears (int gear) {
//    return "Moved to gear " + gear;
//  }
//
//  @Override
//  public int speed(int speed) {
//    return super.speed(speed) * 2;
//  }
//
//  @Override
//  public String steering(String direction) {
//    changingGears(1);
//    return super.steering(direction);
//  }
//
//  public int getDoors() {
//    return doors;
//  }
//
//  public int getWheels() {
//    return wheels;
//  }
//
//  public double getEnginePower() {
//    return enginePower;
//  }
}
