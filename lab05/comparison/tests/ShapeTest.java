import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The ShapeTest class contains unit tests for the Rectangle, Circle, and Triangle classes.
 * It tests the area and perimeter calculations of each shape.
 */
public class ShapeTest {

    /**
     * Tests the calculation of the area for a rectangle.
     */
    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(0, 0, 4, 5);
        assertEquals(20.0, rectangle.area(), 0.001);
    }

    /**
     * Tests the calculation of the perimeter for a rectangle.
     */
    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(0, 0, 4, 5);
        assertEquals(18.0, rectangle.perimeter(), 0.001);
    }

    /**
     * Tests the calculation of the area for a circle.
     */
    @Test
    public void testCircleArea() {
        Circle circle = new Circle(0, 0, 5);
        assertEquals(78.539, circle.area(), 0.001);
    }

    /**
     * Tests the calculation of the perimeter for a circle.
     */
    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle(0, 0, 5);
        assertEquals(31.415, circle.perimeter(), 0.001);
    }

    /**
     * Tests the calculation of the area for a triangle.
     */
    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(0.0, 0.0, 3.0, 0.0);
        assertEquals(6.0, triangle.area(), 0.001);
    }

    /**
     * Tests the calculation of the perimeter for a triangle.
     */
    @Test
    public void testTrianglePerimeter() {
        Triangle triangle = new Triangle(0, 0, 3, 0);
        assertEquals(12.0, triangle.perimeter(), 0.001);
    }
}