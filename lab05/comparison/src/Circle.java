/**
 * The Circle class represents a geometric circle.
 * It extends the AbstractShape class and provides implementations for the area and perimeter calculations.
 * A circle is defined by its center coordinates and radius.
 * @see AbstractShape
 */
public class Circle extends AbstractShape {
    /**
     * The radius of the circle.
     */
    private double radius;

    /**
     * Constructs a Circle object with the specified center coordinates and radius.
     * @param x      the x-coordinate of the center of the circle.
     * @param y      the y-coordinate of the center of the circle.
     * @param radius the radius of the circle.
     */
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return the area of the circle.
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter of the circle.
     * @return the perimeter of the circle.
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}