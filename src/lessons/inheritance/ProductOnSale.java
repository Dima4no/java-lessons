package lessons.inheritance;

public class ProductOnSale extends Product {

    private double sale;

    public ProductOnSale(String title, double price, String category, double sale) {
        super(title, price, category);
        this.sale = sale;
    }

    public ProductOnSale(String title, double sale) {
        super(title);
        this.sale = sale;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    @Override
    public String toString(){
        return super.toString() + ", Sale: " + sale;
    }

}
