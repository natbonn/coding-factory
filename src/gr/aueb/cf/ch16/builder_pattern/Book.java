package gr.aueb.cf.ch16.builder_pattern;

public class Book {
    private final long id;
    private final String title;
    private final String author;
    private final String isbn;

    // Nested Builder class
    public static class Builder {

        // Required fields
        private final long id;
        private final String isbn;

        // Optional fields
        private String title = "";
        private String author = "";

        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        // Ειδικοί setters για τα προαιρετικά πεδία
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        // Builder method
        public Book build() {
            return new Book(this);
        }
    }

    private Book(Builder builder) {
        this.id     = builder.id;
        this.title  = builder.title;
        this.author = builder.author;
        this.isbn   = builder.isbn;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
