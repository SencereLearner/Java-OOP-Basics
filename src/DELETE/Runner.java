package DELETE;

public class Runner {
  public static void main(String[] args) {
    D d = new D();
    C c = new C(d);
    B b = new B(c);
    A a = new A(b);

    a.b.c.d.dmethod();
    a.b.c.cmethod();
    a.b.bmethod();



  }
}
