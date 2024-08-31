import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Book> dispatchedBooks = new ArrayList<>();

    public void addBook(Book book) {
        if (findBookByIsbn(book.getIsbn()) != null) {
            throw new IllegalArgumentException("Book with ISBN " + book.getIsbn() + " already exists.");
        }
        books.add(book);
    }

    public boolean borrowBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            dispatchedBooks.add(book);
            return true;
        }
        return false;
    }

    public void returnBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            book.setAvailable(true);
            dispatchedBooks.remove(book);
        }
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public List<Book> getDispatchedBooks() {
        return new ArrayList<>(dispatchedBooks);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books); // Return a copy to prevent external modification
    }

    public void printAvailableBooks() {
        List<Book> availableBooks = getAvailableBooks();
        if (availableBooks.isEmpty()) {
            System.out.println("No books are currently available.");
        } else {
            System.out.println("Available Books:");
            for (Book book : availableBooks) {
                System.out.println("ISBN: " + book.getIsbn() +
                        ", Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor() +
                        ", Year: " + book.getYear());
            }
        }
    }

    public void printDispatchedBooks() {
        if (dispatchedBooks.isEmpty()) {
            System.out.println("No books are currently dispatched.");
        } else {
            System.out.println("Dispatched Books:");
            for (Book book : dispatchedBooks) {
                System.out.println("ISBN: " + book.getIsbn() +
                        ", Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor() +
                        ", Year: " + book.getYear());
            }
        }
    }

    public void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("All Books:");
            for (Book book : books) {
                System.out.println("ISBN: " + book.getIsbn() +
                        ", Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor() +
                        ", Year: " + book.getYear());
            }
        }
    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
