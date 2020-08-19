package utils;


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

}
