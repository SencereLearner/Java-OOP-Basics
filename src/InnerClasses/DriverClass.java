package InnerClasses;

public class DriverClass {
  public static void main(String[] args) {
    Gearbox macLaren = new Gearbox(6);
    Gearbox.Gear first = macLaren.new Gear (1, 12.3);
    System.out.println(first.driveSpeed(1000));
  }
}
