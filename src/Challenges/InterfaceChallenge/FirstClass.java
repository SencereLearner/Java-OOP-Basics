package Challenges.InterfaceChallenge;
import ArrayList.ArrayList;

public class FirstClass implements ISavable {
  private int score;
  private String name;
  private String weapon;

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getWeapon() {
    return weapon;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  @Override
  public String toString() {
    return "FirstClass{" +
            "score=" + score +
            ", name='" + name + '\'' +
            ", weapon='" + weapon + '\'' +
            '}';
  }

  @Override
  public ArrayList<String> list() {
    return null;
  }

  @Override
  public void readArrayList(ArrayList<String> savedValues) {

  }
}

