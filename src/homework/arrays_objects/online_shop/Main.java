package homework.arrays_objects.online_shop;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        OnlineShop shop = new OnlineShop(3);

        Owner owner1 = new Owner("Alice", "tel: +8619518763492");
        Owner owner2 = new Owner("Bob", "tel: +450398269509");
        Owner owner3 = new Owner("Dan", "tel: +12984873029");
        Owner owner4 = new Owner("Chris", "tel: +62398402936");
        Owner owner5 = new Owner("Elizabeth", "tel: +79382658749");

        shop.addProduct("Laptop", owner1, 5965.8, 0);
        shop.addProduct("Smartphone", owner2, 10000.55, 1);
        shop.addProduct("Tablet", owner3, 3085.41, 2);
        shop.addProduct("Smartwatch", owner4, 1543, 3);
        shop.addProduct("Headphones", owner5, 550, 4);
        shop.addProduct("Camera", owner3, 32086, 5);
        shop.addProduct("Television", owner1, 55089, 6);
        shop.addProduct("Refrigerator", owner2, 12000, 7);
        shop.addProduct("Microwave", owner4, 2044, 8);
        shop.addProduct("Air Conditioner", owner5, 5324, 9);
        shop.addProduct("Bluetooth Speaker", owner3, 560, 10);
        shop.addProduct("Gaming Console", owner5, 4500, 11);

        shop.printProductList();

        Product product1 = new Product("Wireless mouse", owner4, 355.85);
        shop.updateProduct(product1, 5);

        shop.printProductList();

        shop.getProductsByOwner("Dan");

        shop.getMostExpensiveProduct();

        shop.getLeastExpensiveProduct();
    }
}

