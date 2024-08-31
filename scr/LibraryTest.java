import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LibraryTest {

    @Test
    public void testAddBookWithUniqueIsbn() {
        Library library = new Library();
        Book book1 = new Book("123", "The Hobbit", "J.R.R. Tolkien", 1937);
        library.addBook(book1);

        assertEquals(1, library.getBooks().size());
        assertEquals(book1, library.getBooks().get(0));
    }

    @Test
    public void testAddBookWithDuplicateIsbn() {
        Library library = new Library();
        Book book1 = new Book("123", "The Hobbit", "J.R.R. Tolkien", 1937);
        Book book2 = new Book("123", "1984", "George Orwell", 1949);

        library.addBook(book1);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            library.addBook(book2);
        });

        String expectedMessage = "Book with ISBN 123 already exists.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testBorrowBook() {
        Library library = new Library();
        Book book = new Book("123", "The Hobbit", "J.R.R. Tolkien", 1937);
        library.addBook(book);

        boolean isBorrowed = library.borrowBook("123");

        assertTrue(isBorrowed);
        assertEquals(0, library.getAvailableBooks().size());
    }

    @Test
    public void testBorrowUnavailableBook() {
        Library library = new Library();
        Book book = new Book("123", "The Hobbit", "J.R.R. Tolkien", 1937);
        library.addBook(book);
        library.borrowBook("123");

        boolean isBorrowedAgain = library.borrowBook("123");

        assertFalse(isBorrowedAgain);
    }

    @Test
    public void testReturnBook() {
        Library library = new Library();
        Book book = new Book("123", "The Hobbit", "J.R.R. Tolkien", 1937);
        library.addBook(book);
        library.borrowBook("123");

        library.returnBook("123");

        assertEquals(1, library.getAvailableBooks().size());
        assertTrue(library.getAvailableBooks().contains(book));
    }

    @Test
    public void testViewAvailableBooks() {
        Library library = new Library();
        Book book1 = new Book("123", "The Hobbit", "J.R.R. Tolkien", 1937);
        Book book2 = new Book("456", "1984", "George Orwell", 1949);
        library.addBook(book1);
        library.addBook(book2);

        library.borrowBook("123");

        assertEquals(1, library.getAvailableBooks().size());
        assertEquals(book2, library.getAvailableBooks().get(0));
    }


}
