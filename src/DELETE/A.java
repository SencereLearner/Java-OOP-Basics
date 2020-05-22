package DELETE;

public class A {
  public B b;

  public A(B b) {
    this.b = b;
  }


  public void bmethod() {
    System.out.println("I am " + getClass().getSimpleName() + " class");
  }
}
