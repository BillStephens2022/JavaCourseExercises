package LinkedList;

import java.util.LinkedList;

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
        removeElements(placesToVisit);
        System.out.println(placesToVisit);
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

}
