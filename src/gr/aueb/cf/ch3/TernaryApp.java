package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής για τον υπολογισμό
 * μικρότερου μεταξύ δύο ακέραιων.
 */

public class TernaryApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        //Είσοδος δεδομένων
        System.out.println("Εισάγετε δύο ακέραιους: ");
        num1 = in.nextInt();
        num2 = in.nextInt();


        //Επεξεργασία - Εκχώρηση υπό συνθήκη (Conditional Assignment)
           //   if (num1 < num2) {
           //  min = num1;
           // } else {
           // min = num2;

        min = num1 < num2 ? num1 : num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Ο μικρότερος αριθμός μεταξύ " + num1 + " και " + num2 + " είναι: " + min);

    }
}
