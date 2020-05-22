package Challenges.PolymorphismChallenge;

public class PolymorphismChallenge {

  public static void main(String[] args) {
  Cars cars = new Cars(8, "Base Car");
  cars.startEngine();
  cars.accelerate();
  cars.brake();

  Mercedes mercedes = new Mercedes(8, "Mercedes S600");
  mercedes.startEngine();
  mercedes.accelerate();
  mercedes.brake();

  Toyota toyota = new Toyota(4, "Toyota Outlander");
  toyota.startEngine();
  toyota.accelerate();
  toyota.brake();

  Honda honda = new Honda(4, "Honda Pilot");
  honda.startEngine();
  honda.accelerate();
  honda.brake();
  }
}

class Cars {
  private boolean engine;
  private int cylinders;
  private int wheels;
  private String name;

  public Cars(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
    this.engine = true;
    this.wheels = 4;
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName() {
    return name;
  }

  public void startEngine() {
    System.out.println(getClass().getSimpleName() + "-->startEngine is called");
  }

  public void accelerate() {
    System.out.println(getClass().getSimpleName() + "-->accelerate is called");
  }

  public void brake() {
    System.out.println(getClass().getSimpleName() + "-->brake is called");
  }
}

class Mercedes extends Cars {

  public Mercedes(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public void startEngine() {
    System.out.println(getClass().getSimpleName() + "-->startEngine is called");
  }


  @Override
  public void accelerate() {
    System.out.println(getClass().getSimpleName() + "-->accelerate is called");
  }

  @Override
  public void brake() {
    System.out.println(getClass().getSimpleName() + "-->brake is called");
  }
}

class Toyota extends Cars {

  public Toyota(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public void startEngine() {
    System.out.println(getClass().getSimpleName() + "-->startEngine is called");
  }

  @Override
  public void accelerate() {
    System.out.println(getClass().getSimpleName() + "-->accelerate is called");
  }

  @Override
  public void brake() {
    System.out.println(getClass().getSimpleName() + "-->brake is called");
  }
}

class Honda extends Cars {

  public Honda(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public void startEngine() {
    super.startEngine();
    System.out.println(getClass().getSimpleName() + "-->startEngine is called");
  }

  @Override
  public void accelerate() {
    super.accelerate();
    System.out.println(getClass().getSimpleName() + "-->accelerate is called");
  }

  @Override
  public void brake() {
    super.brake();
    System.out.println(getClass().getSimpleName() + "-->brake is called");
  }
}


