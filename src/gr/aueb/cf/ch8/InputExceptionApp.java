package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * To {@link java.util.InputMismatchException} δημ ιουργείται
 */

public class InputExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο: ");
//        num = scanner.nextInt();
        if (!scanner.hasNextInt()) {      //state test
            System.out.println("Δεν εισάγατε έναν ακέραιο. ");
        } else {
            num = scanner.nextInt();
        }

        System.out.println("Ο ακέραιος είναι ο: " + num);
    }
}
