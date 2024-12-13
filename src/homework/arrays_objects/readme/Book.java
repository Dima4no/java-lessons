package homework.arrays_objects.readme;

import java.util.UUID;

public class Book {

    private UUID id;
    private String title;
    private Author author;
    private int year;
    private boolean isAvailable;

    public Book(String title, Author author, int year, boolean isAvailable) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String title, Author author, int year) {
       this(title, author, year, true);
    }

    public UUID getId() {return id;}
    public String getTitle() {return title;}
    public Author getAuthor() {return author;}
    public int getYear() {return year;}
    public boolean getIsAvailable() {return isAvailable;}

    public void setTitle(String title) {this.title = title;}
    public void setAuthor(Author author) {this.author = author;}
    public void setYear(int year) {this.year = year;}
    public void setIsAvailable(boolean isAvailable) {this.isAvailable = isAvailable;}

    @Override
    public String toString() {
        return "Book title is " + title + "\n" +
                author + "\n" +
                "Year: " + year + "\n" +
                "Availability: " + isAvailable;
    }
}
