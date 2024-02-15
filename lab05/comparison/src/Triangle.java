import java.util.Arrays;
/**
 * The Triangle class represents a geometric triangle specified by three points.
 * It extends the AbstractShape class and provides implementations for the area and perimeter calculations.
 * A triangle is defined by its vertices (points) in a two-dimensional coordinate system.
 * If the points are collinear, the triangle is considered degenerate with an area of 0.
 */

public class Triangle extends AbstractShape {
    /**
     * The vertices of the triangle.
     */
    private Point2D[] points;

    /**
     * Constructs a Triangle object with the specified coordinates of three vertices.
     * The first vertex is considered the reference point inherited from AbstractShape.
     * Throws an IllegalArgumentException if the points are collinear.
     * @param x1 the x-coordinate of the first vertex.
     * @param y1 the y-coordinate of the first vertex.
     * @param x2 the x-coordinate of the second vertex.
     * @param y2 the y-coordinate of the second vertex.
     * @param x3 the x-coordinate of the third vertex.
     * @param y3 the y-coordinate of the third vertex.
     * @throws IllegalArgumentException if the points are collinear.
     */
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1); // Assuming the first point is the reference point
        points = new Point2D[3];
        points[0] = new Point2D(x1, y1);
        points[1] = new Point2D(x2, y2);
        points[2] = new Point2D(x3, y3);

        if (arePointsCollinear(points)) {
            throw new IllegalArgumentException("Points are collinear.");
        }
    }

    /**
     * Checks if the three points are collinear.
     * @param points the vertices of the triangle.
     * @return true if the points are collinear, false otherwise.
     */
    private boolean arePointsCollinear(Point2D[] points) {
        double slope = (points[1].getY() - points[0].getY()) * (points[2].getX() - points[1].getX());
        slope -= (points[2].getY() - points[1].getY()) * (points[1].getX() - points[0].getX());
        return slope == 0;
    }

    /**
     * Calculates the area of the triangle using the shoelace formula.
     * @return the area of the triangle.
     */
    @Override
    public double area() {
        double x1 = points[0].getX();
        double y1 = points[0].getY();
        double x2 = points[1].getX();
        double y2 = points[1].getY();
        double x3 = points[2].getX();
        double y3 = points[2].getY();

        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }

    /**
     * Calculates the perimeter of the triangle.
     * @return the perimeter of the triangle.
     */
    @Override
    public double perimeter() {
        double side1 = calculateDistance(points[0], points[1]);
        double side2 = calculateDistance(points[1], points[2]);
        double side3 = calculateDistance(points[2], points[0]);
        return side1 + side2 + side3;
    }

    /**
     * Calculates the Euclidean distance between two points.
     * @param p1 the first point.
     * @param p2 the second point.
     * @return the Euclidean distance between the two points.
     */

    private double calculateDistance(Point2D p1, Point2D p2) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Returns a string representation of the triangle.
     * @return a string representation of the triangle.
     */
    @Override
    public String toString() {
        return "Triangle{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}