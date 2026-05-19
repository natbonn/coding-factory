package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Αναζήτηση ενός στοιχείου σε ένα πίνακα.
 */

public class ArraySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 0;
        int position = 0;

        System.out.println("Please insert a value to search for: ");
        value = in.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.print("Value not found");
        } else {
            System.out.println("Value:  " + arr[position] + " found at position: " + (position + 1));
        }

    }
    //Πρώτος τρόπος - δύο σημεία εξόδου
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;               //δεν υπαρχει πινακας

        for (int i = 0; i < arr.length; i++) {   // διατρέχουμε όλα τα στοιχεία
            if (arr[i] == value) {               // σύγκριση
                return i;
            }
        }

        return -1;                              //σημαίνει δεν βρέθηκε
    }

    //Δεύτερος τρόπος = καλύτερη γιατί έχει ένα σημείο εξόδου
    public static int getPositionV2(int[] arr, int value) {
        if (arr == null) return -1;
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}