package lessons.abstract_classes;

public abstract class GeometricShape {

    private String title;

    public GeometricShape(String title) {
        this.title = title;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Shape: " + title +
            "\nArea: " + getArea() +
            "\nPerimeter: " + getPerimeter();
    }
}
