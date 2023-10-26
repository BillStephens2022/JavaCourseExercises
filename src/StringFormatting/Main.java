package StringFormatting;

public class Main {

    // "\n" = new line
    // "\t" = tab
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point\n";
        System.out.println(bulletIt);


// TEXT BLOCK (opening and closing triple quotes to frame the text block)
        // """ (triple quotes) used to create a text block - note that we no longer need \n or \t as above,
        // we can just hit return for a new line and the tab button to get the right spacing.
        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Second Point
                """;
        System.out.println(textBlock);

        // printf - note that age replaces the %d below (d is for "decimal integer").
        // the %n can be used to add a new line instead of \n
        int age = 35;
        System.out.printf("your age is %d%n", age);

        // print f with multiple arguments - age and yearOfBirth replace the 2 %d placeholders.
        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth Year = %d%n", age, yearOfBirth);
        // Let's print age as a floating # '%f'.  will need to cast age as float in order for this to work since
        // age was declared as an 'int'
        System.out.printf("Your age is %f%n", (float) age);
        // We can adjust the precision on the floating point number to 2 decimals (%.2f)
        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i < 100000; i*=10) {
            System.out.printf("Printing %d %n", i);
        }

        // adjust the above to adjust the width of the number to 6 ('%6d')
        // the numbers are now justified to the right since width has been set
        for (int i = 1; i < 100000; i*=10) {
            System.out.printf("Printing %6d %n", i);
        }

        // another way of formatting a string
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        // this does the same as above
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

        // Custom function created below this 'Main' class
        printInformation("Hello World");
        // check to make sure error is handled if string is empty - should print "String is empty"
        printInformation("");
        // check to make sure error is handled if string is blank - should print "String is blank"
        printInformation("\t   \n");
        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf("r"));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf("l"));
        System.out.printf("last index of l = %d %n", helloWorld.lastIndexOf("l"));

        System.out.printf("index of l from index 3 = %d %n", helloWorld.indexOf("l", 3)); // returns 3
        System.out.printf("last index of l from index 8 = %d %n", helloWorld.lastIndexOf("l", 8)); // returns 3 (remember that it searches from end of string to beginning)

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }

        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }

}
