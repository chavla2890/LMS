public class Main {
public static void main(String args[]){
    Library library = new Library();

    Book book1 = new Book("123", "The Hobbit", "J.R.R. Tolkien", 1937);
    Book book2 = new Book("456", "1984", "George Orwell", 1949);
    Book book3 = new Book("789", "To Kill a Mockingbird", "Harper Lee", 1960);
    Book book4 = new Book("101", "The Great Gatsby", "F. Scott Fitzgerald", 1925);
    Book book5 = new Book("102", "Moby Dick", "Herman Melville", 1851);

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);
    library.addBook(book5);

    library.borrowBook("123");


    library.returnBook("123");

    library.printAvailableBooks();
    library.printDispatchedBooks();

    library.printAllBooks();
}
}
