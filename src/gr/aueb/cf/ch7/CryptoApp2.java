package gr.aueb.cf.ch7;

import java.util.Scanner;
import static gr.aueb.cf.ch7.CryptoApp.decrypt;
import static gr.aueb.cf.ch7.CryptoApp.encrypt;

/**
 * CryptoApp2 demonstrates the use of encryption and decryption methods.
 * It prompts the user to input a message, encrypts it,
 * and then decrypts it to show the original message.
 */

public class CryptoApp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userText = "";

        System.out.println("Please insert your message below: ");
        userText = scanner.nextLine();

        String encrypted = encrypt(userText);
        String decrypted = decrypt(encrypted);

        System.out.println("Original text: " + userText);
        System.out.println("Encrypted text: " + encrypted);
        System.out.println("Decrypted text: " + decrypted);

    }
}


