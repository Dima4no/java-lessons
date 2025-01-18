package lessons.abstract_classes;

public class Square extends GeometricShape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + side;
    }
}
