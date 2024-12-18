package homework.arrays_objects.online_shop;

import java.util.UUID;

public class Owner {

    private UUID id;
    private String name;
    private String contactInfo;

    public Owner(UUID id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {return name;}
    public UUID getId() {return id;}
    public String getContactInfo() {return contactInfo;}

    public void setName(String name) {this.name = name;}
    public void setContactInfo(String contactInfo) {this.contactInfo = contactInfo;}

    @Override
    public String toString() {
        return "Owner id is: " + id + " , Owner name is: " + name + " , contact information: " + contactInfo;
    }
}
