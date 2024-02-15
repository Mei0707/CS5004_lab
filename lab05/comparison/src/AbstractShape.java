/**
 * The AbstractShape class provides a partial implementation of the Shape interface,
 * including a reference point and the compareTo method for comparing shapes based on their areas.
 * Subclasses of AbstractShape must implement the area() and perimeter() methods to calculate
 * the area and perimeter of the shape, respectively.
 */
public abstract class AbstractShape implements Shape {
    /**
     * The reference point of the shape.
     */
    private Point2D referencePoint;

    /**
     * Constructs an AbstractShape object with the specified coordinates as the reference point.
     * @param x the x-coordinate of the reference point.
     * @param y the y-coordinate of the reference point.
     */
    public AbstractShape(double x, double y) {
        referencePoint = new Point2D(x, y);
    }

    /**
     * Constructs an AbstractShape object with no specified reference point.
     * This constructor is intended for subclasses to set the reference point later.
     */
    protected AbstractShape() {
    }

    /**
     * Retrieves the reference point of the shape.
     * @return the reference point of the shape.
     */
    public Point2D getReferencePoint() {
        return referencePoint;
    }

    /**
     * Compares this shape with another shape based on their areas.
     * @param other the other shape to compare to.
     * @return a negative integer, zero, or a positive integer if this shape is less than, equal to,
     * or greater than the other shape in terms of area.
     */
    @Override
    public int compareTo(Shape other) {
        double thisArea = this.area();
        double otherArea = other.area();
        return Double.compare(thisArea, otherArea);
    }
}