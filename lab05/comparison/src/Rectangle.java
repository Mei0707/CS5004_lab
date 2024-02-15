/**
 * The Rectangle class represents a geometric rectangle.
 * It extends the AbstractShape class and provides implementations for the area and perimeter calculations.
 * A rectangle is defined by its width and height, along with a reference point.
 * @see AbstractShape
 */
public class Rectangle extends AbstractShape {
    /**
     * The width of the rectangle.
     */
    private double width;
    /**
     * The height of the rectangle.
     */
    private double height;

    /**
     * Constructs a Rectangle object with the specified coordinates, width, and height.
     * @param x      the x-coordinate of the reference point.
     * @param y      the y-coordinate of the reference point.
     * @param width  the width of the rectangle.
     * @param height the height of the rectangle.
     */
    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     * @return the area of the rectangle.
     */
    @Override
    public double area() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * @return the perimeter of the rectangle.
     */
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    /**
     * Returns a string representation of the rectangle.
     * @return a string representation of the rectangle.
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}