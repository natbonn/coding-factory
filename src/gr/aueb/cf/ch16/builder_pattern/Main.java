package gr.aueb.cf.ch16.builder_pattern;

public class Main {

    public static void main(String[] args) {
        Book pythonBook = new Book.Builder(1, "A123").build();

        Book javaBook = new Book.Builder(2, "B123")
                            .title("Java Programming")
                            .author("John Doe")
                            .build();

        Book javaScriptBook = new Book.Builder(3, "G135")
                .title("JavaScript Programming")
                .build();
    }
}
