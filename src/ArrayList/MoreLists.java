package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        // note that List is immutable (unlike ArrayList)
        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println(list.getClass().getName());

        // Unlike List (above), Array List is mutable, we'll add an item
        // here we create a new ArrayList, passing in the 'list' created above.
        ArrayList<String> groceries = new ArrayList<>(list);
        // Since we now have an ArrayList, we can add more elements
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        System.out.println(nextList);
        // here we add all the items of next list into the groceries list
        groceries.addAll(nextList);
        System.out.println(groceries);
        // get 3rd item in groceries ArrayList
        System.out.println("Third item = " + groceries.get(2));

        // using contains method in a condition
        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }

        // let's add in another 'yogurt' to the list. note that it already contains a yogurt.
        groceries.add("yogurt");
        // now we'll get the first index that has yogurt
        System.out.println("first = " + groceries.indexOf("yogurt"));  // 4
        // and then we'll get the last index that has yogurt
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));  // 8

        System.out.println(groceries);
        // remove item at index 1 (bananas)
        groceries.remove(1);
        System.out.println(groceries);
        // remove "yogurt" -
        // remember that above we added in a 2nd instance of "yogurt", so note that
        // this will only remove the first index where "yogurt" appears
        groceries.remove("yogurt");
        System.out.println(groceries);

        // removes apples and eggs
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        // retains only the items listed, however notice that apples was removed above prior
        // to this code running, so you will not see apples in the list - it only retains the items
        // that it can find.
        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        // clear all items out of the groceries list
        groceries.clear();
        System.out.println(groceries);
        // Let's confirm that it is in fact empty using isEmpty() method.
        System.out.println("isEmpty = " + groceries.isEmpty());

        // add some items back to the list, note use of 2 different methodologies, both work.
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        // print groceries list, then sort, and print again.  Natural order sorts it in
        // alphabetical order
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        // and now we'll sort in reverse order
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        // convert to an Array
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}
