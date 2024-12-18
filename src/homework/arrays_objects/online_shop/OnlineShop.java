package homework.arrays_objects.online_shop;

import java.util.UUID;

public class OnlineShop {

    private Product[] products;
    private int initialCapacity;

    public OnlineShop(int initialCapacity) {
        this.products = new Product[initialCapacity];
    }

    public void addProduct(Product product, int index) {
        if(index < 0 || products[index] != null) {
            System.out.println("The product on this index is already exists or incorrect index!");
        }
        if(index >= products.length) {
            growCapacity();
        }
        products[index] = product;
    }

    public void addProduct(UUID id, String name, Owner owner, double price, int index) {
        if(index >= products.length) {
            growCapacity();
        }
        Product product = new Product(id, name, owner, price);
        addProduct(product, index);
    }

    public void growCapacity() {
        Product[] newProducts = new Product[products.length + 1];
        for(int i = 0; i < products.length; i++) {
            newProducts[i] = products[i];
        }
        products = newProducts;
    }

    public void updateProduct(Product product, int index) {
        if(index >= products.length) {
            System.out.println("Invalid index: " + index);
        } else if(products[index] == null) {
            System.out.println("Product on index: " + index + " does not exist!");
        } else {
            products[index] = product;
        }
    }

    public void removeProductById(UUID id) {
        if(id != null) {
            for(int i = 0; i < products.length; i++) {
                if (products[i].getId().equals(id)) {
                    products[i] = null;
                }
            }
        } else {
            System.out.println("The book with id: " + id + "does not exist!");
        }
        printProductList();
    }

    public void printProductList() {
        if(products.length == 0) {
            System.out.println("There are no products!");
        }
        for(int i = 0; i < products.length; i++) {
            if(products[i] != null) {
                System.out.println("\n" + products[i].toString());
            }
        }
    }

    public Product[] getProductsByOwner(String ownerName) {
        int size = countProductsByOwner(ownerName);
        if(size == 0) {
            System.out.println("No products found by owner!");
            return new Product[0];
        }
        Product[] result = new Product[size];
        int index = 0;
        for(int i = 0; i < products.length; i++) {
            result[index] = products[i];
            index++;
        }
        return result;
    }

    public int countProductsByOwner(String ownerName) {
        int count = 0;
        for(int i = 0; i < products.length; i++) {
            if(products[i].getOwner().getName().equals(ownerName)) {
                count++;
            }
        }
        return count;
    }

    public Product getMostExpensiveProduct() {
        if(products == null || products.length == 0) {
            return null;
        }
        Product mostExpensive = products[0];
        for(int i = 0; i < products.length; i ++) {
            if(products[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = products[i];
            }
        }
        return mostExpensive;
    }

    public Product getLeastExpensiveProduct() {
        if(products == null || products.length == 0) {
            return null;
        }
        Product leastExpensive = products[0];
        for(int i = 0; i < products.length; i++) {
            if(products[i].getPrice() < leastExpensive.getPrice()) {
                leastExpensive = products[i];
            }
        }
        return leastExpensive;
    }
}
