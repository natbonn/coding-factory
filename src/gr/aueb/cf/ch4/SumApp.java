package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει το άθροισμα των 50 πρώτων ακεραίων
 * με τη χρήση της for.
 */

public class SumApp {

    public static void main(String[] args) {

        //Αρχικοποίηση
        int sum = 0;

        //Loop για υπολογισμό τιμών
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Sum: " + sum);
    }
}
