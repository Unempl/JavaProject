import java.text.DateFormatSymbols;
import java.util.Locale;

/**
 * record a upgrade jdk17 issue - SEPT in Locale.UK
 */
public class LocaleDefinition {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);

        DateFormatSymbols symbols = new DateFormatSymbols();
        String[] shortMonths = symbols.getShortMonths();

        for (int i = 0; i < shortMonths.length; i++) {
            System.out.println(i + ": " + shortMonths[i]);
        }
        System.out.println(Locale.getDefault());

//        String dateInput = "2021-09-15";
//
//        Locale.setDefault(Locale.UK);
//
//        DateTimeFormatter formatterJDK10 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        DateTimeFormatter formatterJDK11 = DateTimeFormatter.ofPattern("MMM");
//
//        LocalDate date = LocalDate.parse(dateInput, formatterJDK10);
//
//        String monthJDK10 = formatterJDK10.format(date).substring(5, 8).toUpperCase();
//        String monthJDK11 = formatterJDK11.format(date).toUpperCase();
//
//        System.out.println("JDK 10: " + monthJDK10);
//        System.out.println("JDK 11: " + monthJDK11);


//        String dateInput = "2021-09-15";
//
//        Locale localeUK = Locale.UK;
//        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
//                .appendLiteral(' ')
//                .appendText(ChronoField.MONTH_OF_YEAR, createCustomMonthNames())
//                .toFormatter(localeUK);
//
//        LocalDate date = LocalDate.parse(dateInput);
//        String abbreviatedMonth = formatter.format(date).toUpperCase();
//
//        System.out.println("Abbreviated Month: " + abbreviatedMonth);
//    }
//
//    private static Map<Long, String> createCustomMonthNames() {
//        Map<Long, String> customMonthNames = new HashMap<>();
//        customMonthNames.put(9L, "SEP");
//        return customMonthNames;
//    }
    }
}
