package gr.aueb.cf.ch4;

/**
 * Το πρόγραμμα εμφανίζει emojis από το U+1F600 μέχρι το U+1F64F.
 * Τα emojis έχουν Unicode τιμές μεγαλύτερες από U+FFFF, άρα δεν χωράνε
 * σε έναν απλό char. Για αυτό χρησιμοποιούμε int για να κρατήσουμε τον
 * κωδικό του emoji και την Character.toChars() για να τον μετατρέψουμε
 * σε surrogate pair ώστε να εμφανιστεί σωστά.
 *
 * Κάθε 8 emojis γίνεται αλλαγή γραμμής για καλύτερη εμφάνιση.
 */

public class EmojiApp {
    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;
        int emoji;

        emoji = emojiStart;
        while (emoji < emojiEnd) {
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 8 == 0) {
                System.out.println();
            }
        }
    }
}
