package gr.aueb.cf.ch7;

/**
 * To s1 δείχνει σε νέα τιμή στο heap,
 * ενώ το παλιό string μένει χωρίς αναφορα (reference)
 * και γίνεται garbage collected.
 *
 * Επομένως τα Strings είναι immutable
 */

public class ImmutableApp {
    public static void main(String[] args) {
        String s1 = "Coding Factory";

        s1 = "Coding Plus";
    }
}
