package gr.aueb.cf.ch7;

/**
 * Κρυπτογράφηση και αποκρυπτογράφηση String.
 */
public class CryptoApp {

    private static final int SHIFT = 4;
    private static final int ALPHABET_SIZE = 26;

    public static void main(String[] args) {
        String plainText = "Hello World";
        String encrypted = encrypt(plainText);
        String decrypted = decrypt(encrypted);

        System.out.println("Original: " + plainText);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }

    /**
     * Κρυπτογραφεί ένα String.
     * @param s το String που θα κρυπτογραφηθεί
     * @return το κρυπτογραφημένο String
     */
    public static String encrypt(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
                ch = (char) ('A' + (ch - 'A' + SHIFT) % ALPHABET_SIZE);
            }

            sb.append(ch);
        }

        return sb.toString();
    }

    /**
     * Αποκρυπτογραφεί ένα String.
     * @param s το String που θα αποκρυπτογραφηθεί
     * @return το αποκρυπτογραφημένο String
     */
    public static String decrypt(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
                ch = (char) ('A' + (ch - 'A' - SHIFT + ALPHABET_SIZE) % ALPHABET_SIZE);
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}
