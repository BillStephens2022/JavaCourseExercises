package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {
       GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "produce", 6);
        groceryArray[2] = new GroceryItem("oranges", "produce", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        // note: 'add' method accepts an index, in this case we'll add apples to beginning of list
        // groceryList.add(0, new GroceryItem("apples", "PRODUCE", 6));
        // replace above line of code with 'set' method instead - note that the set
        // method replaces the item in position zero, which in this case is "butter"
        groceryList.set(0, new GroceryItem("apples", "PRODUCE", 6));
        // remove an item - removing at item at index 1 which is milk.
        groceryList.remove(1);
        System.out.println(groceryList);



    }
}
