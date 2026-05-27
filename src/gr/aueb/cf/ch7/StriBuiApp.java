package gr.aueb.cf.ch7;

/**
 * StringBuilder Demo.
 */

public class StriBuiApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result;
        String reversed;

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        result = sb.toString();    // typecast σε String
        reversed = sb
                .reverse()
                .toString();

        System.out.println("Result: " + result);
        System.out.println("Reversed: " + reversed);
    }
}
