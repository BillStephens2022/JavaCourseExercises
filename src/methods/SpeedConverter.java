package methods;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long result = 0;
        if (kilometersPerHour < 0) {
            result = -1;
            return result;
        }
        result = Math.round(kilometersPerHour / 1.609);
        return result;
    }

    public static void printConversion(double kilometersPerHour) {
      long milesPerHour = toMilesPerHour(kilometersPerHour);
      if(milesPerHour == -1) {
          System.out.println("Invalid Value");
      } else {
          System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
      }
    }
}
