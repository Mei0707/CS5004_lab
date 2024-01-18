/**
 *Generate a class of shoe that  summarize the object in terms of its attributes as a String.
 *
 * @param type a string that giving the shoe's type
 * @param color a string that giving the shoe's color
 * @param brand a string that giving the shoe's brand
 * @param size a double that giving the shoe's size
 */
public class Shoe {
    private String type;
    private String color;
    private String brand;
    private double size;

    /**
     * Construct all four attributes as parameters.
     * @param type string that giving the shoe's type
     * @param color a string that giving the shoe's color
     * @param brand a string that giving the shoe's brand
     * @param size a double that giving the shoe's size
     */
    public Shoe(String type, String color, String brand, double size) {
        this.type = type;
        this.color = color;
        this.brand = brand;
        this.size = size;
    }

    /**
     * Get method for 'type' attribute
     * @return return the type information of shoe.
     */
    public String getType() {
        return type;
    }

    /**
     * Get method for 'color' attribute
     * @return return the color information of shoe.
     */
    public String getColor() {
        return color;
    }

    /**
     * Get method for 'brand' attribute
     * @return return the brand information of shoe.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Get method for 'size' attribute
     * @return return the size information of shoe.
     */
    public double getSize() {
        return size;
    }

    /**
     * String method to summarize the object in terms of its attributes as a String.
     * @return return the summary of the information of shoe.
     */
    public String summarize() {
        return "Shoe [type=" + type + ", color=" + color + ", brand=" + brand + ", size=" + size + "]";
    }

}