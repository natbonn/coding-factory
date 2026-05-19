package gr.aueb.cf.ch6;

/**
 * Διαβάζεται το ίδιο από την αρχή προς το τέλος
 * και από το τέλος προς την αρχή
 * [1, 2, 3, 3, 2, 1] ειναι συμμετρικός πίνακας
 * [1, 2, 3, 2, 1] ειναι συμμετρικος πινακας
 */

public class ArraySymmetric {
    public static void main(String[] args) {

    }

    /**
     * Επιστρέφει true αν ο πινακας ειναι συμμετρικος
     * αλλιως false
     * @param arr  ο πινακας που θελουμε να ελεγξουμε
     * @return   true αν ο πινακας ειναι συμμετρικος, αλλιως false
     */

    public static boolean isArraySymmetric(int[] arr) {
        if (arr == null) return false;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) return false;
        }

        return true;
    }
}
