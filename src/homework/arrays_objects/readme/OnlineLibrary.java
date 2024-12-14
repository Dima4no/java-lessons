package homework.arrays_objects.readme;

import java.util.Objects;
import java.util.UUID;

public class OnlineLibrary {

    private Book[] books;
    private int initialCapacity;

    public OnlineLibrary(int initialCapacity) {
        this.books = new Book[initialCapacity];
    }

    public void addBook(Book book, int index) {
        if (index < 0) {
            System.out.println("[addBook] - Invalid index: " + index);
        } else if (books[index] != null) {
            System.out.println("[addBook] - Book on index " + index + " already exists!");
        }

        if (index >= books.length) {
            growCapacity();
        }
        books[index] = book;
    }

    public void addBook(String title, Author author, int year, int index) {
        Book book = new Book(title, author, year);
        addBook(book, index);
    }

    private void growCapacity() {
        Book[] newBooks = new Book[books.length + 1];
        for (int index = 0; index < books.length; index++) {
            newBooks[index] = books[index];
        }
        books = newBooks;
    }

    public void updateBook(Book book, int index) {
        if (index < 0 || index > books.length) {
            System.out.println("[updateBook] - Invalid index: " + index);
        } else if (books[index] == null) {
            System.out.println("[updateBook] - Book on index " + index + " does not exist!");
        } else {
            books[index] = book;
        }
    }

    public void removeBookById(UUID id) {
        if (id != null) {
            for (int index = 0; index < books.length; index++) {
                if (books[index].getId().equals(id)) {
                    books[index] = null;
                }
            }
        } else {
            System.out.println("[removeBookById] - The book with " + id + " does not exist!");
        }
    }

    public void printBooksList() {
        if(books.length == 0) {
            System.out.println("No books in the library!");
        }
        for (int index = 0; index < books.length; index++) {
            if (books[index] != null) {
                System.out.println("\n" + books[index].toString());
            }
        }
    }

    public Book[] getBooksByAuthor(String name) {
        int newSize = countBooksByAuthor(name);
        if (newSize == 0) {
            System.out.println("No books found by author: " + name);
            return new Book[0];
        }
        Book[] newBooks = new Book[newSize];
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().getName().equals(name)) {
                newBooks[index] = books[i];
                index++;
            }
        }
        return newBooks;
    }

    public int countBooksByAuthor(String name) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().getName().equals(name)) {
                count++;
            }
        }
        return count;
    }
}


/*

  [][][] - 3
   0 1 2

   for(int i = 0; i < 3; i++)
   i = 0
   i = 1
   i = 2



 */
