import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author);
        }
    }
}

public class LibraryAggregationDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "Alice");
        Book book2 = new Book("OOP Concepts", "Bob");

        Library library1 = new Library();
        Library library2 = new Library();

        library1.addBook(book1);
        library2.addBook(book2);
        library2.addBook(book1);

        System.out.println("Library 1:");
        library1.displayBooks();

        System.out.println("\nLibrary 2:");
        library2.displayBooks();
    }
}
