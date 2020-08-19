package utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringUtils {
    private static final String character = "qQwWeErRtTyYuUiIoOpPaAsSdDfFgGhHjJkKlLzZxXcCvVbBnNmM";
    private static final String number = "0123456789";

    public static String getRandomCharacter(int range) {
        StringBuilder randomBuilder = new StringBuilder();
        for (int i = 0; i < range; i++) {
            randomBuilder.append(character.charAt((int) (Math.random() * character.length())));
        }
        return randomBuilder.toString();
    }

    public static String getRandomNumber(int range) {
        StringBuilder randomNumber = new StringBuilder();
        for (int i = 0; i < range; i++)
            randomNumber.append(number.charAt((int) (Math.random() * number.length())));
        return randomNumber.toString();
    }

    public static String changeDateFormat(String date, String oldFormat, String newFormat) {
        Date localDate = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat(oldFormat);
        try {
            localDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        dateFormat = new SimpleDateFormat(newFormat);
        return dateFormat.format(localDate);
    }

    public static String getCurrentDate(String format) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
