package StringManipulation;

public class Main {
    public static void main(String[] args) {
        String birthdate = "25/11/1982";
        // index gives you the starting index of the substring 1982
        int startingIndex = birthdate.indexOf("1982");
        System.out.println("Starting Index = " + startingIndex);
        // returns part of string after the starting index
        System.out.println("Birth year = " + birthdate.substring(startingIndex));

        // another way to create a date
        System.out.println("Month = " + birthdate.substring(3, 5));
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

        // another inefficient way to create a date
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        // another way to create a date
        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);

        // another way to create a date
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        // reformat date using replace method
        System.out.println(newDate.replace("/", "-"));

        // reformat date using replaceFirst method - only replaces first character - note that this uses REGEX
        System.out.println(newDate.replaceFirst("/", "-"));

        // replaceAll method - note that this uses REGEX (different than the replace method)
        System.out.println(newDate.replaceAll("/", "---"));

        // repeat method
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        // chaining on indent method - indent by 8 spaces
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        // chaining on indent method - indent by -2 spaces which
        // partially offsets leading 4 empty spaces in string
        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));


    }
}
