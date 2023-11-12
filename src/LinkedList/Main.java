package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // 1 way to set up a Linked List
        // LinkedList<String> placesToVisit = new LinkedList<>();

        // another way to set up a linked list.
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

        // gettingElements(placesToVisit);
        // printItinerary(placesToVisit);
        // printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");

        // Queue Methods
        list.offer("Melbourne"); //adds to end
        list.offerFirst("Brisbane");  // adds to start
        list.offerLast("Toowoomba"); // adds to end

        // Stack Methods
        list.push("Alice Springs"); // adds to start
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4); // removes item at 4th index
        list.remove("Brisbane"); // Can also pass in the value itself

        System.out.println();
        // pass in no arguments to 'remove' method
        String s1 = list.remove();  // removes 1st element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();  // removes 1st element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();  // removes last element
        System.out.println(s3 + " was removed");

        // Queue/Dequeue poll methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast(); // removes Last element
        System.out.println(p3 + " was removed");

        // adding names back into list since list is now empty after all items were removed above
        list.push("Sydney"); // adds to beginning of list
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);  // [Canberra, Brisbane, Sydney] since each item added to start

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " was removed"); // removes Canberra
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4)); //gets item at index 4
        System.out.println("First Element = " + list.getFirst()); //gets first element
        System.out.println("Last Element = " + list.getLast()); //gets last element
        // gets the index of an item of first item it finds, searching from beginning
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        // gets the last occurrence of an item in the list, searching from end (returns the
        // first index it finds starting from the end of the list).
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));
        // Queue retrieval method
        System.out.println("Element from element() = " + list.element()); // gets first element

        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek()); // retrieves first element
        System.out.println("Element from peekFirst() = " + list.peekFirst());// retrieves first element
        System.out.println("Element from peekLast() = " + list.peekLast()); // retrieves last element

    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());


        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
        }

        System.out.println("Trip ends at: " + list.getLast());
    }

  // same as printItinerary, but using enhanced for loop
    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());

        String previousTown = list.getFirst();

        for (String town: list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at: " + list.getLast());
    }

    // // same as printItinerary, but using a list iterator
    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());

        String previousTown = list.getFirst();
        // note passing index of 1, otherwise it will print ('From: Alice Springs to Alice
        // Springs', on first line, which we don't want
        ListIterator<String> iterator = list.listIterator(1);

        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at: " + list.getLast());
    }


}
