package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TaxiCost {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int km = 0;
        int euros = 0;
        int cents = 0;
        int totalCostInCents = 0;

        // Final  Prices
        final int START_COST = 300;      // 3 euro
        final  int COST_PER_KM = 74;     // 0,74 euro

        System.out.println("Παρακαλώ εισάγετε τα συνολικά χιλιόμετρα (ακέραιος αριθμός):  ");
        km = in.nextInt();

        totalCostInCents = START_COST + km * COST_PER_KM;

        // Υπολογισμοί
        euros = totalCostInCents / 100;
        cents = totalCostInCents % 100;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Κόστος: %d ευρώ και %d λεπτά", euros, cents);


    }
}
