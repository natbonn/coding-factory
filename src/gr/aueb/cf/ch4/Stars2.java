package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει τη n και
 * εκτυπώνονται τα αντίστοιχα stars
 */


public class Stars2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numStars = 0;

        System.out.println("Δώστε τον αριθμό που θα αντιστοιχεί στα εκτυπώσιμα αστεράκια: ");
        numStars = in.nextInt();

        //oριζόντια αστεράκια
        System.out.println("Οριζόντια:");
        for (int i = 1; i <= numStars; i++) {
            System.out.print("*");
        }
        System.out.println();      //αλλαγή γραμμής

        //κάθετα αστεράκια
        System.out.println("Κάθετα: ");
        for (int i = 1; i <= numStars; i++) {
            System.out.println("*");
        }
        System.out.println();

        //n*n αστεράκια
        System.out.println("n*n αστεράκια: ");
        for (int i = 1; i <= numStars; i++) {
            for (int j = 1; j <= numStars; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //από 1 έως n
        System.out.println("Αστεράκια από 1 έως n: ");
        for (int i = 1; i <= numStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //από n έως 1
        System.out.println("Αστεράκια από n έως 1: ");
        for (int i = numStars; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}