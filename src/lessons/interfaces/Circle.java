package lessons.interfaces;

public class Circle implements Computable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle radius is: " + radius;
    }

    @Override
    public double computeArea() {
        // area of circle = pi * radius * radius
        return Math.PI * radius * radius;
    }

    @Override
    public double computePerimeter() {
        // perimeter of circle = 2 * PI * radius
        return 2 * Math.PI * radius;
    }
}
