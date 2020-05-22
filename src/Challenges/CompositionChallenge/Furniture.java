package Challenges.CompositionChallenge;

public class Furniture {
  private int chairs;
  private int tables;
  private int beds;
  private Utencils utencils;
  private Commodities commodities;

  public Furniture(int chairs, int tables, int beds, Utencils utencils, Commodities commodities) {
    this.chairs = chairs;
    this.tables = tables;
    this.beds = beds;
    this.utencils = utencils;
    this.commodities = commodities;
  }

  public int getChairs() {
    return chairs;
  }

  public int getTables() {
    return tables;
  }

  public int getBeds() {
    return beds;
  }

  public Utencils getUtencils() {
    return utencils;
  }

  public Commodities getCommodities() {
    return commodities;
  }
}
