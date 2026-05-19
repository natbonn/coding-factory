package gr.aueb.cf.ch3;

import java.util.Iterator;
import java.util.Scanner;
/**
 *  Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει θερμοκρασία
 *  Το πρόγραμμα υπολογίζει αν η θερμοκρασία είναι < 0 μια μεταβλητή έστω,
 *  isTempBelowZero γίνεται true, αλλιώς false.
 *  Τέλος εκτυπώνει το αποτέλεσμα.
 */


public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασία:" );
        temperature = scanner.nextInt();

        isTempBelowZero = temperature < 0;

        System.out.println("Η θερμοκρασία είναι κάτω από το μηδέν: " + isTempBelowZero);
    }
}
