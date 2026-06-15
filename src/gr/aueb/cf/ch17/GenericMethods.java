package gr.aueb.cf.ch17;

public class GenericMethods {

    public static void main(String[] args) {
        String[] strArr = {"Hello", "World"};
        Integer[] intArr = {1, 2, 3};

        printArray(strArr);
        printArray(intArr);
    }

    // Γενική μέθοδος χωρίς όριο
    public static <T> void printArray(T[] arr) {
        for (T el : arr) {
            System.out.println(el);
        }
    }

    // Μέθοδος με ? για getValue(); οποιουδήποτε τύπου
    public static void print(GenericNode<?> node) {
        System.out.println(node.getValue());
    }

    // Ίδια μέθοδος με ? extends Number με άνω φράγμα / οτιδήποτε κάτω από το Number
    public static void printNumbers(GenericNode<? extends Number> node) {
        System.out.println(node.getValue());
    }

    // Ίδια με ? super - Κάτω φράγμα / οτιδήποτε πάνω από Number (Number και οι υπερκλάσεις του)
    public static void printNumbers2(GenericNode<? super Number> node) {
        System.out.println(node.getValue());
    }






}
