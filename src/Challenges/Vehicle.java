package Challenges;

public class Vehicle {

  private String name;
  private String size;

  private int currentVelocity;
  private int currentDirection;

  public Vehicle(String name, String size) {
    this.name = name;
    this.size = size;

    this.currentVelocity = 0;
    this.currentDirection = 0;
  }

  public void steer (int direction) {
    this.currentDirection += direction;
    System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
  }

  public void move (int velocity, int direction) {
    currentVelocity = velocity;
    currentDirection = direction;
    System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
  }

  public void stop () {
    this.currentVelocity = 0;
  }

  //private int weight;
//private int size;
//private String color;
//private String bodyType;
//
//private int speed = 0;
//
//  public Vehicle(int weight, int size, String color, String bodyType) {
//    this.weight = weight;
//    this.size = size;
//    this.color = color;
//    this.bodyType = bodyType;
//  }
//
//  public String steering (String direction) {
//    return "Changing direction to the " + direction;
//  }
//
//  public int speed (int speed) {
//    return this.speed += speed;
//  }
//
//  public int getWeight() {
//    return weight;
//  }
//
//  public int getSize() {
//    return size;
//  }
//
//  public String getColor() {
//    return color;
//  }
//
//  public String getBodyType() {
//    return bodyType;
//  }
//
//  public int getSpeed() {
//    return speed;
//  }
}
