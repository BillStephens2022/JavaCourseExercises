package StringBuilder;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        // original capacity if not stated is 16.  When we add 17 chars, the capacity will automatically
        // note that the capacity adjusts to 34
        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");
        // replace the uppercase G with a lowercase g.
        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        // replace the lowercase g with the uppercase G
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        // reverse the string and truncate first 7 chars of the reversed string
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);

    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());

    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());

    }
}
