package org.example;

import java.util.HashMap;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean copiesAvailable;

    // Constructor
    public Book(String title, String author, String isbn, boolean copiesAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copiesAvailable = copiesAvailable;
    }

    // Getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(boolean copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

}

class Library {
    private HashMap<String, Book> books = new HashMap<>();

    // Add Book
    public void addBook (Book book) {
        books.put(book.getIsbn(), book);
    }

    // Borrow A Book (reduce copies)
    public void borrowBook (String isbn) {
        Book book = books.get(isbn);
        if (book.getIsbn().equals(isbn)) {
            book.setCopiesAvailable(false);
            System.out.println("Book borrowed successfully!");
        }
    }

    // Return A Book (increase copies)
    public void returnBook (String isbn) {
        Book book = books.get(isbn);
        if (book.getIsbn().equals(isbn)) {
            book.setCopiesAvailable(true);
        }
        System.out.println("Book returned successfully!");
    }

    // Search for a book
    public Book searchBook (String author) {
        return books.values().stream().filter(
                b -> b.getAuthor().equals(author))
                .findFirst().orElse(null);
    }
}

public class Main12 {
    public static void main(String[] args) {
        // Create a Library
        Library library = new Library();

        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0141182683", true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-006085479X", true);
        Book book3 = new Book("1984", "George Orwell", "978-0451524934", true);
        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Borrow a book
        library.borrowBook("978-0141182683");

        // Return a book
        library.returnBook("978-0141182683");

        // Search for a book
        System.out.println(library.searchBook("F. Scott Fitzgerald").getTitle()); // Output: The Great Gatsby
    }
}
