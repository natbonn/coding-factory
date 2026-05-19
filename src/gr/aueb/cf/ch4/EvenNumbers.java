package gr.aueb.cf.ch4;

/**
 * Το πρόγραμμα εκτυπώνει τους ζυγούς αριθμούς
 * από το 1 έως το 20 με τη χρήση της for.
 */

public class EvenNumbers {
    public static void main(String[] args) {


        for (int i = 1; i <= 20; i++) {

            //Έλεγχος αν ο αριθμός είναι ζυγός.
            if (i % 2 == 0) System.out.print(i + " ");
        }
    }
}