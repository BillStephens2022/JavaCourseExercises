package ArrayAndArrayLists;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        // set 1st element to "one" (replaces "First" above)
        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        // note that by changing the list you've also changed the array
        System.out.println("array: " + Arrays.toString(originalArray));

        // sort in naturalOrder.  Note, the result is a bit unexpected - in natural order,
        // uppercase letters come before lowercase letters.
        // So, it gets sorted as [Second, Third, one]
        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));
    }
}
