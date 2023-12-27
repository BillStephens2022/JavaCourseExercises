package SetsAndMaps;

import java.util.*;

public class MapViewsMain {
    public static void main(String[] args) {

        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));

        Set<String> keysView = contacts.keySet();
        System.out.println(keysView);

        Set<String> copyOfKeys = new TreeSet<>(contacts.keySet());
        System.out.println(copyOfKeys);

        if (contacts.containsKey("Linus Van Pelt")) {
            System.out.println("Linus and I got way back, so of course I have info");
        }

        keysView.remove("Daffy Duck");  // note that removing this from the keysView also removes it from the contacts HashMap
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        copyOfKeys.remove("Linus Van Pelt");  // note that removing it from the copy does not remove it from the contacts HashMap
        System.out.println(copyOfKeys);
        contacts.forEach((k, v) -> System.out.println(v));

        keysView.retainAll(List.of("Linus Van Pelt", "Charlie Brown", "Robin Hood", "Mickey Mouse"));  // note that after this is done the contacts Hashmap only contains these 4 names & contact info
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        keysView.clear(); // clears both the keysView as well as the contacts hashmap
        System.out.println(contacts);

//        keysView.add("Daffy Duck"); // get an error, because can't use add on a keySet
//        System.out.println(contacts);

        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        System.out.println(keysView);  // note that re-populating the contacts hashmap also re-populated the keySet keysView

        var values = contacts.values();
        values.forEach(System.out::println);

        values.retainAll(ContactData.getData("email"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println("---------------------------------------------------------");
        List<Contact> list = new ArrayList<>(values);
        list.sort(Comparator.comparing(Contact::getNameLastFirst));
        list.forEach(c -> System.out.println(c.getNameLastFirst() + ": " + c));

        System.out.println("---------------------------------------------------------");
        Contact first = list.get(0);
        contacts.put(first.getNameLastFirst(), first);
        values.forEach(System.out::println);
        keysView.forEach(System.out::println);

        HashSet<Contact> set = new HashSet<>(values);
        set.forEach(System.out::println);
        if (set.size() < contacts.keySet().size()) {
            System.out.println("Duplicate values are in my Map");
        }

        var nodeSet = contacts.entrySet();
        for (var node : nodeSet) {
            System.out.println(nodeSet.getClass().getName());
            if (!node.getKey().equals(node.getValue().getName())) {
                System.out.println(node.getClass().getName());
                System.out.println("Key doesn't match name: " + node.getKey() + ": " +
                        node.getValue());
            }
        }
    }
}
