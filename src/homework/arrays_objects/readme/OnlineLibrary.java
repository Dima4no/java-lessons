package homework.arrays_objects.readme;


import java.util.UUID;

public class OnlineLibrary {

    private Book[] books;
    private int initialCapacity;

    public OnlineLibrary(int initialCapacity) {
        this.books = new Book[initialCapacity];
    }

    public void addBook(Book book, int index) {
        if(index <= 0) {
            System.out.println("Incorrect input!");
        } else if (books[index] != null) {
            System.out.println("Book on this index is already exist!");
        }

        if(index >= books.length) {
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
        for(int index = 0; index < books.length; index++) {
            newBooks[index] = books[index];
        }
        books = newBooks;
    }

    public void updateBook(Book book, int index) {
        if(index < 0 || index > books.length) {
            System.out.println("Invalid index!");
        } else if (books[index] == null) {
            System.out.println("Book on this index does not exist!");
        } else {
            books[index] = book;
        }
    }

    public void removeBookById(UUID id) {
        if(id != null) {
            for (int index = 0; index < books.length; index++) {
                if (books[index].getId().equals(id)) {
                    books[index] = null;
                }
            }
        } else {
            System.out.println("This book does not exist!");
        }
    }

    public void printBooksList() {
        for(int index = 0; index < books.length; index++) {
            if(books[index] != null) {
                System.out.println(books[index].toString());
            }
        }
    }

    public Book[] getBooksByAuthor(String name) {
        Book[] newBooks = new Book[books.length];
        for(int i = 0; i < books.length; i++) {
            if(books[i].getAuthor().getName().equals(name)) {
              newBooks[i] = books[i];
            }
        }
        return newBooks;
    }
}
