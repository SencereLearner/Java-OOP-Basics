package Challenges;

public class MitsubishiEvolutionExtendsFromCarClass extends CarExtendsFromVehicle {

  private int roadServiceMonth;

  public MitsubishiEvolutionExtendsFromCarClass(int roadServiceMonth) {
    super("Mitsubishi","4WD", 4, 4, 6, false, 1);
    this.roadServiceMonth = roadServiceMonth;
  }
  //  private int turboPower;
//  private String model;
//
//  public MitsubishiEvolutionExtendsFromCarClass(int weight, int size, String color, String bodyType, int doors, int wheels, double enginePower, int turboPower, String model) {
//    super(weight, size, color, bodyType, doors, wheels, enginePower);
//    this.turboPower = turboPower;
//    this.model = model;
//  }
//  //acceleration
//  @Override
//  public int speed(int speed) {
//    return super.speed(speed) * 3;
//  }
//
//  public int getTurboPower() {
//    return turboPower;
//  }
//
//  public String getModel() {
//    return model;
//  }
//
//  @Override
//  public String changingGears(int gear) {
//    return super.changingGears(gear);
//  }
}
