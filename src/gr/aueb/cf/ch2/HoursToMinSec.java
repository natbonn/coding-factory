package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη έναν ακέραιο που αντιστοιχεί σε ώρες.
 * Μετατρέπει σε λεπτά και δευτερόλεπτα και τα εκτυπώνει.
 *
 */

public class HoursToMinSec {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int minutes = 0;
        int seconds = 0;
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3600;

        //Input - Data Binding
        System.out.println("Πσρακαλώ εισάγετε τον αριθμό των ωρών: ");
        inputHours = scanner.nextInt();

        //Εντολές επεξεργασίας
        minutes = inputHours * HOURS_TO_MINUTES;
        seconds = inputHours * HOURS_TO_SECONDS;

        //εκτύπωση αποτελέσματος
        System.out.printf("Ώρες: %d, Λεπτά: %d, Δευτερόλεπτα: %d\n", inputHours, minutes, seconds);

    }


}
