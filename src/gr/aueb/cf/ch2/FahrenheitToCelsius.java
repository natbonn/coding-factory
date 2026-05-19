package gr.aueb.cf.ch2;

/**
 * Fahrenheit to Celsius
 * Converter App
 */

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please insert temperature in Fahrenheit: ");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;      //  5/9=0 λαθος αποτελεσμα

        System.out.println("Celsius: " + celsius);

    }

}
