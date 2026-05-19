package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Διαβάζει ένα αρχείο κειμένου και εμφανίζει το περιεχόμενο του στην κονσόλα,
 */

public class ReadFilesApp {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("C:\\Users\\natbo\\OneDrive\\Desktop\\Coding Factory\\students.txt");
        String context = Files.readString(filePath);
        System.out.println(context);
    }
}
