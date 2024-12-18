package homework.arrays_objects.online_shop;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        OnlineShop shop = new OnlineShop(3);

        Owner owner1 = new Owner(UUID.randomUUID(), "Alice", "tel: +8619518763492");
        Owner owner2 = new Owner(UUID.randomUUID(), "Bob", "tel: +450398269509");
        Owner owner3 = new Owner(UUID.randomUUID(), "Dan", "tel: +12984873029");
        Owner owner4 = new Owner(UUID.randomUUID(), "Chris", "tel: +62398402936");
        Owner owner5 = new Owner(UUID.randomUUID(), "Elizabeth", "tel: +79382658749");

        UUID id1 = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        UUID id3 = UUID.randomUUID();
        UUID id4 = UUID.randomUUID();
        UUID id5 = UUID.randomUUID();
        UUID id6 = UUID.randomUUID();
        UUID id7 = UUID.randomUUID();
        UUID id8 = UUID.randomUUID();
        UUID id9 = UUID.randomUUID();
        UUID id10 = UUID.randomUUID();
        UUID id11 = UUID.randomUUID();
        UUID id12 = UUID.randomUUID();


        shop.addProduct(id1,"Laptop", owner1, 5965.8, 0);
        shop.addProduct(id2,"Smartphone", owner2, 10000.55,1);
        shop.addProduct(id3,"Tablet", owner3, 3085.41, 2);
        shop.addProduct(id4,"Smartwatch", owner4, 1543, 3);
        shop.addProduct(id5,"Headphones", owner5, 550, 4);
        shop.addProduct(id6,"Camera", owner3, 32086, 5);
        shop.addProduct(id7,"Television", owner1, 55089, 6);
        shop.addProduct(id8, "Refrigerator", owner2, 12000, 7);
        shop.addProduct(id9,"Microwave", owner4, 2044, 8);
        shop.addProduct(id10,"Air Conditioner", owner5, 5324, 9);
        shop.addProduct(id11,"Bluetooth Speaker", owner3, 560, 10);
        shop.addProduct(id12,"Gaming Console", owner5,4500, 11);

        shop.printProductList();

        Product product1 = new Product(UUID.randomUUID(), "Wireless mouse", owner4, 355.85);
        shop.updateProduct(product1, 5);

        shop.printProductList();

        shop.getProductsByOwner("Dan");

        shop.getMostExpensiveProduct();

        shop.getLeastExpensiveProduct();
    }
}

