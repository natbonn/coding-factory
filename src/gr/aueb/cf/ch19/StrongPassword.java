package gr.aueb.cf.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Strong passwords with at least 12 char.
 * At least 1 Uppercase, 1 Lowercase,
 * 1 Digit, 1 Special Char.
 */

public class StrongPassword {

    public static void main(String[] args) {
        String password = "Cod1ngF@@ctory";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*])^.{12,}$");
        Matcher matcher = pattern.matcher(password);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
