package gr.aueb.cf.ch19;

public class RegEx {

    public static void main(String[] args) {
        String s = "Hello coding";
//        System.out.println(isHello(s));
//        System.out.println(isHelloOrHi(s));

//        System.out.println(startsWithLetter(s));
        System.out.println(reverse(s));
    }

    public static boolean isHello(String s) {
        return s.matches("Hello");
    }

    public static boolean isHelloOrHi(String s) {
        return s.matches("Hello|Hi");
    }

    // Character classes
    public static boolean isHhello(String s) {
        return s.matches("[Hh]ello");
    }

    public static boolean startsWithUpperCase(String s) {
        return s.matches("[A-Z]coding");
    }

    public static boolean startsWithLetter(String s) {
        return s.matches("[a-zA-Z0-9_]coding");
    }

    // Μεταχαρακτήρες
    public static boolean anyCharAndDigit(String s) {
        return s.matches(".\\d");  // ".[0-9]"
    }

    public static boolean startsWithDotAndDigit(String s) {
        return s.matches("\\");     // .2
    }

    // 02/04/2026 ποσοδείκτες - format
    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");  // "dd/mm/yyyy"
    }

    public static boolean anyCharOneOrMore(String s) {
        return s.matches(".+");        // at least one character
    }

    public static boolean anyCharZeroOrMore(String s) {
        return s.matches(".*");        // zero or more characters
    }

    public static boolean twoWordsSpByOneSpace(String s) {
        return s.matches(".+\\s.+");   // two words separated by one space
    }

    public static String reverse(String s) {
        return s.replaceAll("(.+)\\s(.+)", "$2 $1");  // groups - backreference
    }


}
