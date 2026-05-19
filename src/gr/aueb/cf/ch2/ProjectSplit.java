package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ProjectSplit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalHours = 0;
        int employees = 0;
        int hoursPerEmployee = 0;
        int leftoverHours = 0;

        //Είσοδος δεδομένων
        System.out.println("Γράψτε τις συνολικές ώρες εργασίας: ");
        totalHours = in.nextInt();

        System.out.println("Γράψτε τον συνολικό αριθμό των υπαλλήλων: ");
        employees = in.nextInt();

        if (employees <= 0 || totalHours < 0) {
            System.out.println("Μη έγκυρη είσοδος.");
            return;
        }

        hoursPerEmployee = totalHours / employees;
        leftoverHours = totalHours % employees;

        System.out.printf("Κάθε εργαζόμενος: %d ώρες.\nΏρες που περισσεύουν: %d", hoursPerEmployee, leftoverHours);

    }


}
