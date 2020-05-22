//class Vehicle {
//
//  public Vehicle() {
//    System.out.println("I am the super vehicle");
//  }
//}
//
//class FourWheeler extends Vehicle {
//  public FourWheeler() {
//    System.out.println("I am a car or a truck or whatever 4 wheel has");
//  }
//}
//
//class Car extends FourWheeler{
//  public Car() {
//    System.out.println("I am a car");
//  }
//}
//
//class Demo{
//  public static void main(String[] args) {
//    Car c = new Car();
//  }
//}
public class Vehicle {

//  public static void main(String[] args) {
//
//    String str = " hello ";
//    str.trim();
//    System.out.println(str);
//  }
public static void main(String[] args) {

  String s1 = "true";
  String s2 = "true";

//first sop
  System.out.println(s1==s2);

  String s3= new String("true");

//second sop
  System.out.println(s1==s3);

  String s4= "True";

//Third sop
  System.out.println(s2==s4);

}

}

