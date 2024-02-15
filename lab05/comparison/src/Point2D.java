/**
 * The Point2D class represents a point in a two-dimensional coordinate system.
 * It contains coordinates (x, y) that specify the position of the point.
 */
public class Point2D {
    /**
     * The x-coordinate of the point.
     */
    private double x;
    /**
     * The y-coordinate of the point.
     */
    private double y;

    /**
     * Constructs a Point2D object with the specified x and y coordinates.
     * @param x the x-coordinate of the point.
     * @param y the y-coordinate of the point.
     */
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x-coordinate of the point.
     * @return the x-coordinate of the point.
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of the point.
     * @return the y-coordinate of the point.
     */
    public double getY() {
        return y;
    }
}
