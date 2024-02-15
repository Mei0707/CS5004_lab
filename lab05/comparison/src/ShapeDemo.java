import java.awt.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The ShapeDemo class demonstrates sorting shapes based on area and perimeter.
 * It creates a list of shapes, sorts them based on area using Comparable, and then based on perimeter using Comparator.
 */
public class ShapeDemo {
    /**
     * Main method to demonstrate sorting shapes based on area and perimeter.
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>(); // Use LinkedList
// Add shapes to the list
        shapes.add(new Circle(5.0, 6.0, 15.0));
        shapes.add(new Rectangle((int) 4.0, (int) 6.0, (int) 3.0, (int) 4.0));
        shapes.add(new Triangle(1.0, 2.0, 0.0, 3, -1.0, 0.0));
// Sort shapes based on area (using Comparable)
        Collections.sort(shapes);
// Print the sorted list by area
        System.out.println("Sorted by area:");
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
// Sort shapes based on perimeter (using Comparator)
        Collections.sort(shapes, new PerimeterComparator());
// Print the sorted list by perimeter
        System.out.println("\nSorted by perimeter:");
        for (Shape shape : shapes) {
            System.out.println("Perimeter: " + shape.perimeter());
        }
    }
}
