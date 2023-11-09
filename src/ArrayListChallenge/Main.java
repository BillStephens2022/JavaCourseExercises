package ArrayListChallenge;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add items(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for (String i : items) {
            String trimmed = i.trim();
            // if indexOf method returns a -1 that means the item is not in the list,
            // so it will get added. (ensures no duplicate items get added to list).
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove items(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for (String i : items) {
            String trimmed = i.trim();
            // remove item from list (don't need to check if in the list first, it will
            // still work OK, it will just remove nothing if it can't find.
            groceries.remove(trimmed);


        }
    }

    private static void printActions() {
        String textBlock = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s)  to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:""";
        // add extra space after the text block so there's
        // space after the textblock for the user to type
        System.out.print(textBlock + " ");

    }


}
