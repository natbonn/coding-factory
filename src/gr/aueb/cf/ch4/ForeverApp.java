package gr.aueb.cf.ch4;

/**
 * Demo of infinite loop
 */
public class ForeverApp {
    public static void main(String[] args) {
        int count = 0;
        final int MAX_COUNT = 100;

        for (;;) {
            System.out.print("Forever");
            count++;

            if (count % 10 == 0) System.out.println();   // new line every 10 iterations
            if (count == MAX_COUNT) {      //for check to break at 100
                break;
            }

        }
    }
}
