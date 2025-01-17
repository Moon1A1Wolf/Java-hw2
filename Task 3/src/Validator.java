import java.time.Year;

public class Validator {
    public static boolean isValidString(String input) {
        return input != null && input.matches("[a-zA-Zа-яА-ЯіІїЇґҐ\\s]+");
    }

    public static boolean isValidYear(int year) {
        int currentYear = Year.now().getValue();
        return year >= 1700 && year <= currentYear;
    }

    public static boolean isValidEngineVolume(double volume) {
        return volume > 0 && volume <= 10.0;
    }
}
