package gr.aueb.cf.ch16.callbacks;

import java.awt.print.Printable;

public class Main {

    public static void main(String[] args) {

        // Anonymous class
        IPrintable printable = new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        };

        // Lambda expression
        IPrintable printable2 = () -> System.out.println("Hello World!");

        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        });

        // callback με χρήση lambda expression - σύντμηση μεθόδου
        doPrint(() -> System.out.println("Hello World!"));

        doPrint(() -> sayHello());      // Lambda expression
        doPrint(Main::sayHello);        // Method reference
    }

    // Λειτουργεί ως callback
    public static void doPrint(IPrintable printable) {
        printable.print();
    }

    public static void sayHello() {
        System.out.println("Hello World!");
    }
}
