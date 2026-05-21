package gr.aueb.cf.ch6;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {2, 6, 9, 3, 1, 4, 3, 12};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        // Εκτύπωση αποτελεσμάτων
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
