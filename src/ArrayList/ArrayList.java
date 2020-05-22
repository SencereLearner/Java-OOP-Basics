package ArrayList;

public class ArrayList<S> {
  private java.util.ArrayList<String> groceryList = new java.util.ArrayList<String>();

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();

  }
  public void addGroceryItem (String item) {
    groceryList.add(item);
  }

  public void printGroceryList () {
    System.out.println("You have " + groceryList.size() + " items on your grocery list");
    for (int i = 0; i < groceryList.size(); i ++) {
      System.out.println("Items on the grocery list --> " + groceryList.get(i));
      System.out.println((i + 1) + ". " + groceryList.get(i));//use i + 1 to get first item as 1. not as zero, since in the for loop i = 0.
    }
  }

  public void modifyPosition (int position, String newItem) {
    groceryList.set(position, newItem);
    System.out.println("New item " + newItem + " has been added to position " + (position + 1));
  }

  public void removeGroceryItem (int position) {
    String theItem = groceryList.get(position);
    groceryList.remove(position);
  }

  public String findItem (String item) {
    //boolean exists = groceryList.contains(item);
    int itemIndex = groceryList.indexOf(item);
    if (itemIndex >= 0) {
      return groceryList.get(itemIndex);
    }
    return null;
  }
}
