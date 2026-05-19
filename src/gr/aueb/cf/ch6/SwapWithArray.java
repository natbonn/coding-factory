package gr.aueb.cf.ch6;

public class SwapWithArray {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        int[] arr = {10, 20};

//        swap(a, b);
        swap(arr);

//        System.out.println("a = " + a + ", b = " + b);
        System.out.println("arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);

    }

    public static void swap(int a, int b) {  // ab περνανε by value, δηλ ως αντιγραφα
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void swap(int[] arr) {     // by reference δηλ ως αναφορα
        if (arr != null) return;
        if (arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}
