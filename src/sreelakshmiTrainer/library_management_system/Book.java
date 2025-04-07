package library_management_system;

public class Book {
    // Variables (Attributes)
    String title;
    String author;
    double price;

    // Constructor to initialize book details
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
