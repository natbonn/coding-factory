package gr.aueb.cf.ch2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EuroUsdConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputEuros;
        final int PARITY = 99;   //USA cents
        int totalUsaCents, usaCents, usaDollars;

        // Loop μέχρι να δώσει ο χρήστης σωστό input
        while (true) {
            System.out.println("Please insert an amount (in Euros): ");

            // Έλεγχος αν το input είναι ακέραιος
            if (!in.hasNextInt()) {
                System.out.println("Error: Please enter a valid integer number.");
                in.nextLine(); // καθαρίζει το λάθος input
                continue;      // ξαναζητάει input
            }
            inputEuros = in.nextInt();

            //Έλεγχος αν το input είναι 0
            if (inputEuros < 0) {
                System.out.println("Error: Amount cannot be negative.");
                continue;
            }

//           ΔΕ ΧΡΕΙΑΖΕΤΑΙ γιατί έχω hasNextInt();
//           // Έλεγχος αν ο αριθμός input είναι πολύ μεγάλος
//            if (inputEuros > 1_000_000_000) {
//                System.out.println("Error: Amount too large.");
//                in.nextLine();
//                continue;
//            }

            break;
        }
            totalUsaCents = inputEuros * PARITY;
            usaDollars = totalUsaCents / 100;
            usaCents = totalUsaCents % 100;

            //Εκτύπωση αποτελεσμάτων
            System.out.printf("%d Euros = %d USDollars and %d usa cents.",
                    inputEuros, usaDollars, usaCents);
            in.close();
    }
}
