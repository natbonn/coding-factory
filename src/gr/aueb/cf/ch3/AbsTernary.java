package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο. Το πρόγραμμα υπολογίζει
 * το απόλυτο του ακέραιου. Το απόλυτο ενός ακέραιου
 * είναι θετικός αριθμός. Για παράδειγμα, το απόλυτο του -5 είναι 5.
 * Ενώ το απόλυτο του 5 είναι 5.
 */

public class AbsTernary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Παρακαλώ εισάγεται έναν ακέραιο: ");
        num = in.nextInt();

        abs = num > 0 ? num : -num;

        System.out.printf("Το απόλυτο του %d είναι %d\n", num, abs);
    }
}
