package homework.arrays_objects.online_library;

import java.util.UUID;

public class Author {

    private UUID id;
    private String name;
    private String biography;

    public Author(String name, String biography) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.biography = biography;
    }

    public String getName() {return name;}
    public String getBiography() {return biography;}

    public void setName(String name) {this.name = name;}
    public void setBiography(String biography) {this.biography = biography;}

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Authors name is " + name + "\n" +
                "Author's biography: " + biography;
    }
}
