/**
 * Represent a coordinate with x and y values.
 */
public class Coordinate {
    /**
     * Constructor for coordinate.
     * @param x The x coordinate.
     * @param y The y coordinate.
     */
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int x;
    int y;

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * This method overrides the default equals method inherited from the Object class.
     * It compares the coordinates of this object with another Coordinate object.
     * </p>
     * <p>
     * Two Coordinate objects are considered equal if they have the same x and y coordinates.
     * </p>
     * @param obj The reference object with which to compare.
     * @return true if this Coordinate is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coordinate) {
            Coordinate other = (Coordinate) obj;
            return other.x == this.x && other.y == this.y;
        }
        return false;
    }
}
