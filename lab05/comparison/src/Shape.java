/**
 * The Shape interface represents a geometric shape that can calculate its area and perimeter.
 * Implementing classes must provide implementations for the {@code area()} and {@code perimeter()} methods.
 * This interface extends the {@code Comparable<Shape>} interface to support sorting of shapes.
 */
public interface Shape extends Comparable<Shape> {
    /**
     * Calculates the area of the shape.
     * @return the area of the shape.
     */
    double area();
    /**
     * Calculates the perimeter of the shape.
     * @return the perimeter of the shape.
     */
    double perimeter();
}

//Problem3
//To provide different ordering of shape, and we need to compare base on the
//perimeter. Then we need to modified PerimeterComparator class. We need to
//include the logic to compare shapes based on their perimeters.
//And we need to modify the ShapeDemo class to use the new PerimeterComparator
//to sorting.