package methods;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1924));

    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year < 1 || year > 9999) {
            return result;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    result = true;
                }
            } else {
                result = true;
            }
        } else {
            return result;
        }
        return result;
    }
}
