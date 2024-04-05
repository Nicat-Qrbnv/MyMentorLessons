package lesson19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(useRegex("oiinsf@s.s"));
        String cardNumber = "1234567890123456"; // Example card number
        String maskedCardNumber = maskCardNumber(cardNumber);
        System.out.println(maskedCardNumber); // Output: 1234XXXXXXXX3456
    }

    public static boolean useRegex(final String input) {
        // Compile regular expression
        final Pattern pattern = Pattern.compile("[-A-Za-z0-9!#$%&'*+/=?^_`{|}~]+(?:\\.[-A-Za-z0-9!#$%&'*+/=?^_`{|}~]+)*@(?:[A-Za-z0-9](?:[-A-Za-z0-9]*[A-Za-z0-9])?\\.)+[A-Za-z0-9](?:[-A-Za-z0-9]*[A-Za-z0-9])?", Pattern.CASE_INSENSITIVE);
        // Match regex against input
        final Matcher matcher = pattern.matcher(input);
        // Use results...
        return matcher.matches();
    }

    public static String maskCardNumber(String cardNumber) {
        // Regex pattern to match the first 4 digits followed by 8 digits to replace
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{8})(\\d{4})");

        // Matcher to find and replace
        Matcher matcher = pattern.matcher(cardNumber);

        // If a match is found, replace the middle 8 digits with X
        if (matcher.find()) {
            String replacement = matcher.group(1) + "XXXXXXXX" + matcher.group(3);
            return replacement;
        }

        // If no match is found, return the original string
        return cardNumber;
    }
}
