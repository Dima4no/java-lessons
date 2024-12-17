package homework.arrays_objects.online_shop;

import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private Owner owner;
    private double price;
    boolean isAvailable;

    public Product(String name, Owner owner, double price) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.price = price;
        this.isAvailable = true;
    }

    public UUID getId() {return id;}
    public String getName() {return name;}
    public Owner getOwner() {return owner;}
    public double getPrice() {return price;}

    public void setName(String name) {this.name = name;}
    public void setOwner(Owner owner) {this.owner = owner;}
    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {
        return "Product id is: " + id + " ,product name is: " + name + " ,owner's information: " + owner + " ,price: " + price;
    }
}
