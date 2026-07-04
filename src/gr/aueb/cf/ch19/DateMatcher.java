package gr.aueb.cf.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The input String includes dates in the US format mm/dd/yyyy
 * The program recognizes all dates and prints them
 * in the European format dd/mm/yyyy
 */

public class DateMatcher {

    public static void main(String[] args) {
        String dates = "06/12/2020 xxx yyy ;;;; 11/05/1999xxxxxxxx02/27/2000, 12/12/20255";

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(dates);

        while (matcher.find()) {
            System.out.println(matcher.group());    // όλο το match

            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            String grDate = day + "/" + month + "/" + year;
            System.out.println(grDate);
            System.out.println();
        }
    }
}
