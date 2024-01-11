package DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);  // 2024-01-2024 (today's date)

        LocalDate Five5 = LocalDate.of(2022, 5, 5);
        System.out.println(Five5); // 2022-05-05

        LocalDate May5th = LocalDate.of(2022, Month.MAY, 5);
        System.out.println(May5th); // 2022-05-05

        LocalDate Day125 = LocalDate.ofYearDay(2022, 125);
        System.out.println(Day125);  // 2022-05-05

        LocalDate May5 = LocalDate.parse("2022-05-05");
        System.out.println(May5);  // 2022-05-05

        System.out.println(May5.getYear());  // 2022
        System.out.println(May5.getMonth());  // MAY

        System.out.println(May5.getMonthValue()); // 5

        System.out.println(May5.getDayOfMonth()); // 5
        System.out.println(May5.getDayOfWeek()); // THURSDAY
        System.out.println(May5.getDayOfYear()); // 125

        System.out.println(May5.get(ChronoField.YEAR)); // 2022
        System.out.println(May5.get(ChronoField.MONTH_OF_YEAR)); // 5
        System.out.println(May5.get(ChronoField.DAY_OF_MONTH)); // 5
        System.out.println(May5.get(ChronoField.DAY_OF_YEAR)); // 125

        System.out.println(May5.withYear(2000)); // 2000-05-05
        System.out.println(May5.withMonth(3));  // 2022-03-05
        System.out.println(May5.withDayOfMonth(4)); // 2022-05-04
        System.out.println(May5.withDayOfYear(126)); // 2022-05-06
        System.out.println(May5); // 2022-05-05 (note: unchanged after all of operations above)

        System.out.println(May5.with(ChronoField.DAY_OF_YEAR, 126)); // 2022-05-06
        System.out.println(May5.plusYears(1));  // 2023-05-05
        System.out.println(May5.plusMonths(12)); // 2023-05-05
        System.out.println(May5.plusDays(365)); // 2023-05-05

        System.out.println(May5.plusWeeks(52)); // 2023-05-04 (note: when adding weeks, it aligns to the same weekday.
        System.out.println(May5.getDayOfWeek());  // THURSDAY
        System.out.println(May5.plusWeeks(52).getDayOfWeek()); // THURSDAY

        System.out.println(May5.plus(365, ChronoUnit.DAYS)); // 05-05-2023

        System.out.println("May5 > today? " + May5.isAfter(today)); // false
        System.out.println("today > May5? " + May5.isBefore(today)); // true

        System.out.println("May5 > today? " + May5.compareTo(today)); // -1 (means May 5 2022 is before today)
        System.out.println("today > May5? " + today.compareTo(May5));  // 1 (means today is after May 5 2022)

        System.out.println("today = now ? " + today.compareTo(LocalDate.now())); // 0 (is equal)
        System.out.println("today = now ? " + today.equals(LocalDate.now())); // true

        System.out.println(today.isLeapYear()); // true
        System.out.println(May5.isLeapYear()); // false
        System.out.println(May5.minusYears(2).isLeapYear()); // true

        System.out.println("----------------------------------------------");
        // "datesUntil" provides a stream of dates
        May5.datesUntil(May5.plusDays(7))
                .forEach(System.out::println); // lists each date from 2022-05-05 to 2022-05-11

        // if you wanted to schedule something for every 7 days for a period of a year
        May5.datesUntil(May5.plusYears(1), Period.ofDays(7))
                .forEach(System.out::println);  // lists every 7th day from 2022-05-05 to 2023-05-04

        LocalTime time = LocalTime.now();
        System.out.println(time);  // 07:22:18.653497600

        LocalTime sevenAM = LocalTime.of(7, 0);
        System.out.println(sevenAM); // 07:00

        LocalTime sevenThirty = LocalTime.of(7, 30, 15);
        System.out.println(sevenThirty); // 07:30:15

        LocalTime sevenPM = LocalTime.parse("19:00");
        LocalTime sevenThirtyPM = LocalTime.parse("19:30:15.1000");
        System.out.println(sevenPM); // 19:00
        System.out.println(sevenThirtyPM);  // 19:30:15.100
        System.out.println(sevenAM.get(ChronoField.AMPM_OF_DAY)); // 0  - means 'AM'
        System.out.println(sevenThirtyPM.get(ChronoField.AMPM_OF_DAY)); // 1 - means 'PM'

        System.out.println(sevenThirtyPM.getHour()); // 19
        System.out.println(sevenThirtyPM.get(ChronoField.HOUR_OF_DAY)); // 19

        System.out.println(sevenThirtyPM.plus(24, ChronoUnit.HOURS)); // 19:30:15.100
        System.out.println(sevenPM.range(ChronoField.HOUR_OF_DAY)); // 0 - 23
        System.out.println(sevenPM.range(ChronoField.MINUTE_OF_HOUR)); // 0 -59
        System.out.println(sevenPM.range(ChronoField.MINUTE_OF_DAY)); // 0 -1439
        System.out.println(sevenPM.range(ChronoField.SECOND_OF_MINUTE)); // 0 -59
        System.out.println(sevenPM.range(ChronoField.SECOND_OF_DAY)); // 0 - 86399

        LocalDateTime todayAndNow = LocalDateTime.now();
        System.out.println(todayAndNow); // 2024-01-11T07:46:24.862209500

        LocalDateTime May5Noon = LocalDateTime.of(2022, 5, 5, 12, 0);
        System.out.println(May5Noon); // 2022-05-05T12:00
        System.out.printf("%tD %tr %n", May5Noon, May5Noon); // 05/05/22 12:00:00 PM
        System.out.printf("%1$tF %1$tT %n", May5Noon); // 2022-05-05 12:00:00
        System.out.println(todayAndNow.format(DateTimeFormatter.ISO_WEEK_DATE)); // 2024-W02-4  (week 2, weekday 4 (thurs) of 2024)

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(May5Noon.format(dtf)); // Thursday, May 5, 2022

        System.out.println(May5Noon.format(DateTimeFormatter.ofLocalizedDateTime(
                FormatStyle.MEDIUM
        )));  // May 5, 2022, 12:00:00 PM

        LocalDateTime May6Noon = May5Noon.plusHours(24);
        System.out.println(May6Noon.format(DateTimeFormatter.ofLocalizedDateTime(
                FormatStyle.MEDIUM
        )));  // May 6, 2022, 12:00:00 PM



    }
}
