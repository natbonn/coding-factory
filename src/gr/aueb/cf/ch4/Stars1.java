package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει οριζόντια, κάθετα
 * από 1 ... 10, από 10 ... 1
 * 10 Χ 10 αστεράκια
 */

public class Stars1 {
    public static void main(String[] args) {
        //Δέκα οριζόντια αστεράκια
        for (int i = 1; i <=10; i++) {
            System.out.print("*");
        }

        //Δέκα κάθετα αστεράκια
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        //10 γραμμες χ 10 αστερακια η καθε γραμμη
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //1η γραμμη 1, 2η γραμμή 2, 3η γραμμή 3, .... 10η 10 stars
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //1η 10, 2η 9, 3η 8... 10 1 star
        for (int i = 1; i <= 10; i++) {

            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
