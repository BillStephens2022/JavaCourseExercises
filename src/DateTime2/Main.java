package DateTime2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

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

        for (ZoneId z : List.of(
                ZoneId.of("Australia/Sydney"),
                ZoneId.of("Europe/Paris"),
                ZoneId.of("America/New_York")
        )) {
            DateTimeFormatter zoneFormat = DateTimeFormatter.ofPattern("z:zzzz");
            System.out.println(z);
            System.out.println("\t" + instantNow.atZone(z).format(zoneFormat));
            System.out.println("\t" + z.getRules().getDaylightSavings(instantNow));
            System.out.println("\t" + z.getRules().isDaylightSavings(instantNow));
        }

        Instant dobInstant = Instant.parse("2020-01-01T08:01:00Z");
        LocalDateTime dob =
                LocalDateTime.ofInstant(dobInstant, ZoneId.systemDefault());
        System.out.println("Your kid's birthdate, NY Time = " + dob.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        ));
        ZonedDateTime dobSydney = ZonedDateTime.ofInstant(dobInstant,
                ZoneId.of("Australia/Sydney"));
        System.out.println("Your kid's birthdate, Sydney Time = " + dobSydney.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        ));

        ZonedDateTime dobHere = dobSydney.withZoneSameInstant(ZoneId.systemDefault());
        System.out.println("Your kid's birthdate, Here Time = " + dobHere.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        ));

        ZonedDateTime firstOfMonth = ZonedDateTime.now()
                .with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.printf("First of next Month = %tD %n", firstOfMonth);

        Period timePast = Period.between(LocalDate.EPOCH, dob.toLocalDate());
        System.out.println(timePast); // P5OY  (P=period, 50Y = 50 Years, so dob of Jan 1, 2020 is 50 years past the epoch date of Jan 1, 1970)

        Duration timeSince = Duration.between(Instant.EPOCH, dob.toInstant(ZoneOffset.UTC));
        System.out.println(timeSince); // PT438291H1M (P=period with # of hours and minutes since the epoch time)

        LocalDateTime dob2 = dob.plusYears(2).plusMonths(4)
                .plusDays(4).plusHours(7).plusMinutes(14)
                .plusSeconds(37);

        System.out.println("Your 2nd kid's birthdate, Here Time = " + dob2.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        ));

        Period timePast2 = Period.between(LocalDate.EPOCH, dob2.toLocalDate());
        System.out.println(timePast2);

        Duration timeSince2 = Duration.between(Instant.EPOCH, dob2.toInstant(ZoneOffset.UTC));
        System.out.println(timeSince2);

        for (ChronoUnit u : ChronoUnit.values()) {
            if (u.isSupportedBy(LocalDate.EPOCH)) {
                long val = u.between(LocalDate.EPOCH,
                        dob2.toLocalDate());
                System.out.println(u + " past = " + val);
            } else {
                System.out.println("-- Not supported: " + u);
            }
        }

        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.EPOCH,
                ZoneOffset.UTC);

        for (ChronoUnit u : ChronoUnit.values()) {
            if (u.isSupportedBy(ldt)) {
                long val = u.between(ldt,
                        dob2);
                System.out.println(u + " past = " + val);
            } else {
                System.out.println("-- Not supported: " + u);
            }
        }

    }

}
