package gr.aueb.cf.ch3;



import java.util.Scanner;

public class SecretIterativeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;  //Μυστικός ακέραιος
        int guess = 0;   // Η εικασία του χρήστη

        while (true) {
            System.out.println("Προσπαθήστε να μαντέψετε τον μυστικό ακέραιο.");
            guess = scanner.nextInt();


            if (guess == SECRET) {
                System.out.println("Συγχαρητήρια! Μαντέψατε σωστά.");
                break;
            } else {
                System.out.println("Δεν το βρήκατε, προσπαθήστε ξανά!");
            }
            /*
            if (guess != SECRET) {
                System.out.println("Δεν το βρήκατε, προσπαθήστε ξανά!");
                continue;
                }

            System.out.println("Συγχαρητήρια! Μαντέψατε σωστά!")
                break;
             */
        }

    }
}
