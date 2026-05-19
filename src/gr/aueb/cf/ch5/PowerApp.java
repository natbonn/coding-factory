package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη α^β με μέθοδο
 */

public class PowerApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        //Input & Data Binding
        System.out.println("Παρακαλώ εισάγετε βάση και τον εκθέτη: ");
        base = in.nextInt();
        power = in.nextInt();

        //Calls the service - delegation
        result = pow(base, power);

        System.out.println("Το α^β = " + result) ;
    }
    /**
     * Calculates a^b.
     * @param a   the base power
     * @param b   the exponent
     * @return   the result of a^b
     */
    public static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;  //accumulator
        }
        return result;

    }
}
