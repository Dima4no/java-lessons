package lessons.interfaces;

public class Square implements Computable {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square side is: " + side;
    }

    @Override
    public double computeArea() {
        // area of square = side * side
        return side * side;
    }

    @Override
    public double computePerimeter() {
        // perimeter of square = 4 * side
        return 4 * side;
    }
}
