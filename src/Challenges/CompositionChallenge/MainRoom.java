package Challenges.CompositionChallenge;

public class MainRoom {
  private Furniture furniture;

  public MainRoom(Furniture furniture) {
    this.furniture = furniture;
  }

  public void remoteLight () {
    furniture.getCommodities().lightOn();
    furniture.getCommodities().lightOff();
  }

  public void billPaidTracking () {
    furniture.getCommodities().getBills().billPaid();
  }

  private void utencilsCountPrivate () {
    int count = furniture.getUtencils().forks + furniture.getUtencils().knifes + furniture.getUtencils().spoons;
    System.out.println("The utencils count is: " + count);
  }

  public void utencilsCountPublic () {
    utencilsCountPrivate();
  }

  public void utilitiesSuppliers () {
    System.out.println("Gas supplier is -->" + furniture.getCommodities().getBills().getGasBillingCompanyName());
    System.out.println("Light supplier is -->" + furniture.getCommodities().getBills().getLightBillingCompanyName());
    System.out.println("Water supplier is -->" + furniture.getCommodities().getBills().getWaterBillingCompanyName());
  }

  public Furniture getFurniture() {
    return furniture;
  }

  public void furnutireCount () {
    int count = furniture.getBeds() + furniture.getChairs() + furniture.getTables();
    System.out.println("Furniture count is: " + count);
  }


}
