package homework.arrays_objects.online_library;

import common.ArrayHelper;

public class Main {

    public static void main(String[] args) {
        OnlineLibrary library = new OnlineLibrary(3);

        Author author1 = new Author("George Orwell", "born June 25, 1903, Motihari, Bengal, India—died January 21, 1950, London, England, was an English novelist, essayist, and critic famous for his novels Animal Farm (1945) and Nineteen Eighty-four (1949). The latter of these is a profound anti-utopian novel that examines the dangers of totalitarian rule.");
        Author author2 = new Author("Aldous Huxley", "born July 26, 1894, Godalming, Surrey, England—died November 22, 1963, Los Angeles, California, U.S., was an English novelist and critic gifted with an acute and far-ranging intelligence whose works are notable for their wit and pessimistic satire.");
        Author author3 = new Author("J.K. Rowling", "born 31 July 1965, known by her pen name J. K. Rowling, is a British author and philanthropist. She is the author of Harry Potter, a seven-volume fantasy novel series published from 1997 to 2007.");

        library.addBook(new Book("1984", author1, 1949, true), 0);
        library.addBook(new Book("Brave New World", author2, 1932, true), 1);
        library.addBook(new Book("Harry Potter and the Philosopher's Stone", author3, 1997, true), 2);
        library.addBook(new Book("Harry Potter and the ...", author3, 1997, true), 2);

        library.printBooksList();
        ArrayHelper.printArray(library.getBooksByAuthor(author3.getName()));
    }
}