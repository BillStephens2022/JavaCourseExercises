package DateTime2;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        System.out.println(ZoneId.systemDefault());  // America\New_York

        System.out.println("Number of TZs = " + ZoneId.getAvailableZoneIds().size()); // 603
        ZoneId.getAvailableZoneIds().stream()
                .filter(s -> s.startsWith("US"))
                .sorted()
                .forEach(System.out::println);  // lists all time zones in US

        ZoneId.getAvailableZoneIds().stream()
                .filter(s -> s.startsWith("America"))
                .sorted()
                .map(ZoneId::of)
                .forEach(z -> System.out.println(z.getId()
                        + ": " + z.getRules())); // lists all time zone rules in the Americas (i.e. offsets for each zone)

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        Instant instantNow = Instant.now();
        System.out.println(instantNow);  // time in UTC

    }

}
