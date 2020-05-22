package Challenges.ArrayListChallenge;

class Printer {
  static public void print(Paper p) {
    p.setText("Krishna");
  }
  static class Paper {
    String text;

    public void setText(String t) {
      text = t;
    }
    public String getText() {
      return text;
    }
  }

  static class Final {

    public static void main(String[] args) {
      Paper p = new Paper();
      p.setText("Hare Krishna");
      System.out.println(p.getText());
      Printer hp = new Printer();
      hp.print(p);
      System.out.println(p.getText());
    }
    }
  }
