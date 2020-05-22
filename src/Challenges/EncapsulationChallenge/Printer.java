package Challenges.EncapsulationChallenge;

public class Printer {
  private int tonerLevel;
  private int numberOfPagesPrinted;
  private boolean duplexPrinter;

  public Printer(int tonerLevel, boolean duplexPrinter) {
    this.tonerLevel = tonerLevel;
    this.numberOfPagesPrinted = 0;
    this.duplexPrinter = duplexPrinter;
  }

  public int getTonerLevel() {
    return tonerLevel;
  }

  public int getNumberOfPagesPrinted() {
    return numberOfPagesPrinted;
  }

  public boolean isDuplexPrinter() {
    return duplexPrinter;
  }

  public boolean duplexPrinter(boolean duplexPrinter) {
    return this.duplexPrinter = duplexPrinter;
  }

  public int fillUpToner(int gramsToFillForToner) {
    if (this.tonerLevel + gramsToFillForToner > 100) {
      return -1;
    }
     return this.tonerLevel = this.tonerLevel + gramsToFillForToner;
  }

  public int printingAPage(int pagesPrinted) {
    if (this.duplexPrinter) {
      return this.numberOfPagesPrinted = this.numberOfPagesPrinted + pagesPrinted * 2;
    }
    else return this.numberOfPagesPrinted = this.numberOfPagesPrinted + pagesPrinted;
  }

  public int inkCount () {
    return (int) (this.tonerLevel - (numberOfPagesPrinted * 0.25));
  }
}
