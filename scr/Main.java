public class Main {
public static void main(String args[]){
    //Step 1: Create a Library object
    Library library = new Library();

    // Step 2: Filling Books Detail 
    Book book1 = new Book("123", "The Hobbit", "J.R.R. Tolkien", 1937);
    Book book2 = new Book("456", "1984", "George Orwell", 1949);
    Book book3 = new Book("789", "To Kill a Mockingbird", "Harper Lee", 1960);
    Book book4 = new Book("101", "The Great Gatsby", "F. Scott Fitzgerald", 1925);
    Book book5 = new Book("102", "Moby Dick", "Herman Melville", 1851);
    
    //Step 3: Adding Books to library
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);
    library.addBook(book5);

    // Step 4: Borrow a book from the library
    library.borrowBook("123");

    // Step 5: Viewing All available after borrowing the book
    library.printAvailableBooks();

    // Step 6: Checking which book is dispatch
    library.printDispatchedBooks();

    // Step 7: Returning the borrowed book
    library.returnBook("123");

    // Step 8: Viewing All Available book after return
    library.printAvailableBooks();

    // Step 6: Checking which book is dispatch
    library.printDispatchedBooks();

    // Step 7: See All books Dispatch or Avilable
    library.printAllBooks();
}
}
