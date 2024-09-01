# Incubyte
# Library Management System

## Overview

This project implements a simple library management system that allows users to perform basic operations such as adding books, borrowing books, returning books, viewing all books and viewing available books.

## Features

- **Add Books**: Users can add new books with a unique ISBN, title, author, and publication year.
- **Borrow Books**: Users can borrow available books. The system ensures books are available before borrowing.
- **Return Books**: Users can return borrowed books, updating their availability.
- **View All Books**: Users can view all books.
- **View Available Books**: Users can view a list of all available books.

## Project Structure

- `Library.java`: The class containing the library management system's functionality.
- `Book.java`: The class representing a book with attributes like ISBN, title, author, and publication year.
- `LibraryTest.java`: Contains JUnit tests for verifying the functionality of the library management system.
- `Main.java`: The main file is use to run this project

## Getting Started

### Prerequisites

- Java 8 or later
- Maven (for dependency management)
- JUnit (for testing)

### Setup

1. **Clone the Repository**:

    ```sh
    git clone <repository-url>
    cd Incubyte
    ```

2. **Build the Project / Install Denpendencies**:

    Use Maven to build the project:

    ```sh
    mvn clean install
    ```

3. **Run Tests**:

    To ensure everything is working correctly, run the tests:

    ```sh
    mvn test
    ```

4. **Run the Project**:

    You can run the project by executing the main class if you have set up a main method (not included in the current implementation).

## Usage

```
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

```
### For run this follow the step:
1. Open ternimal 
2. Navigate to Incubyte Folder
3. Type `javac Main.java` it will build class
4. Then type `java Main.java` it will run your file


## Sreenshots
### Adding Books
![Adding Books](./scr/screenshot/addBooks.png)

### View After Adding Books
![View After Adding Books](./scr/screenshot/viewAddedBook%20-%20Copy.png)

### Borrowing Books
![Borrowing Books](./scr/screenshot/borrowingBook.png)

### View After Book Borrow
![View After Borrowing Books](./scr/screenshot/viewAfterBorrowingBook.png)

### Returning Book
![Returning Books](./scr/screenshot/returningBook.png)

### View After Returning Book
![View After Book Return](./scr/screenshot/viewReturningBook.png)

### TestCases
![TestCases](./scr/screenshot/test.png)

