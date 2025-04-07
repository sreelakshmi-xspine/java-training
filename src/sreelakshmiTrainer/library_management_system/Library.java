package library_management_system;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        // ArrayList to store books
        ArrayList<Book> library = new ArrayList<>();

        // Adding books to the library
        library.add(new Book("The Alchemist", "Paulo Coelho", 15.99));
        library.add(new Book("Atomic Habits", "James Clear", 12.50));
        library.add(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 18.75));
        library.add(new Book("Wings of Fire ", "Apj", 18.75));

        // Displaying all books
        System.out.println("Library Book List:");
        for (Book book : library) {
            book.displayBook();
        }
    }
}
