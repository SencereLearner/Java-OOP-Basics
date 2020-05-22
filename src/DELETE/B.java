package DELETE;

public class B {
  public C c;

  public B(C c) {
    this.c = c;
  }


  public void bmethod() {
    System.out.println("I am " + getClass().getSimpleName() + " class");
  }
}
