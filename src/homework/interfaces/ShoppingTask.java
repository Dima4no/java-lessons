package homework.interfaces;

public class ShoppingTask implements TodoItem {

    private String itemName;
    private int quantity;
    private boolean completed;

    public ShoppingTask(String itemName, int quantity){
        this.itemName = itemName;
        this.quantity = quantity;
        this.completed = false;
    }

    public String getItemName() {return itemName;}
    public int getQuantity(){return quantity;}

    public void setItemName(String itemName) {this.itemName = itemName;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    @Override
    public void complete() {
        completed = true;
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String getDescription() {
        return "Buy " + quantity + " " + itemName;
    }
}
