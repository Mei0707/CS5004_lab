import java.awt.*;
import java.util.Comparator;

/**
 * The PerimeterComparator class compares shapes based on their perimeters.
 * It implements the Comparator interface for shapes.
 * Shapes are compared based on their perimeter values in ascending order.
 */
public class PerimeterComparator implements Comparator<Shape> {
    /**
     * Compares two shapes based on their perimeters.
     * @param s1 the first shape to compare.
     * @param s2 the second shape to compare.
     * @return -1 if the perimeter of s1 is less than s2, 1 if the perimeter of s1 is greater than s2,
     * or 0 if the perimeters of both shapes are equal.
     */
    @Override
    public int compare(Shape s1, Shape s2) {
        double perimeter1 = s1.perimeter();
        double perimeter2 = s2.perimeter();

        if (perimeter1 < perimeter2) {
            return -1;
        } else if (perimeter1 > perimeter2) {
            return 1;
        } else {
            return 0;
        }
    }
}