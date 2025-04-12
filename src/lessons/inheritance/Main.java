package lessons.inheritance;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000, "Electronics");
        ProductOnSale productOnSale = new ProductOnSale("Smartphone", 500, "Electronics", 100);
        System.out.println(product.toString());
        System.out.println(productOnSale.toString());

        // BASE         CHILD
        Product p = new ProductOnSale("Tablet", 300, "Electronics", 50);
        ( (ProductOnSale) p).getSale();
    }

}
