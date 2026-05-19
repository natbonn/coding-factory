package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο και το πρόγραμμα
 * τυπώνει την αντίστοιχη ημέρα που αναλογεί στους
 * αριθμούς 1-7.
 */

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayName;

        System.out.print("Εισάγετε ένα ακέραιο (1-7): ");
        int day = scanner.nextInt();

        dayName = switch (day) {
            case 1 -> "Δευτέρα";
            case 2 -> "Τρίτη";
            case 3 -> "Τετάρτη";
            case 4 -> "Πέμπτη";
            case 5 -> "Παρασκευή";
            case 6 -> "Σάββατο";
            case 7 -> "Κυριακή";
            default ->"Λάθος ημέρα!";
        };

        System.out.println("Ημέρα: " + dayName);
    }
}