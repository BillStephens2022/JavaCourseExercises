package ReadingUserInput;

public class Main {
    public static void main(String[] args) {

//        int currentYear = 2022;
//        String userDateOfBirth = "1999";
//
//        // converting a String to an Integer
//        int dateOfBirth = Integer.parseInt(userDateOfBirth);
//
//        System.out.println(currentYear - dateOfBirth);
//
//        String usersAgeWithPartialYear = "22.5";
//
//        // converting a String to a Double
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//
//        System.out.println(ageWithPartialYear);

        int currentYear = 2023;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        return "";
    }
}
