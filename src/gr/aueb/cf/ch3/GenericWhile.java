package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει αρχική τιμή, τελική τιμή
 * και step και το πρόγραμμα υπολογίζει πόσες
 * φορές θα εκτελεστεί μια while.
 */

public class GenericWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;

        System.out.println("Please insert beginValue, " + "Endvalue and Step");
        start = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        while (start <= endValue) {
            counter += 1;
            start += step;
        }
        System.out.println("Iterations count: " + counter);
    }
}
