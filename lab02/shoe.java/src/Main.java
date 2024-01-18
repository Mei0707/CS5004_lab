/**
 * The Main class contains the main method to demonstrate the usage of the Shoe class.
 * It creates an example of the Shoe class, sets its attributes, and show the use
 * of get methods and the summarize method to access and display information about a shoe.
 *
 * @author Qiaowen Mei
 */
public class Main {
    /**
     * The main method is the entry point of the program. It creates an instance of the Shoe class,
     * sets its attributes, and demonstrates the usage of various methods.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        /**
         * Example usage of the Shoe class
         */
        Shoe myShoe = new Shoe("Sneaker", "White", "Nike", 7);

        /**
         * Accessing attributes using getter methods
         */
        System.out.println("Type: " + myShoe.getType());
        System.out.println("Color: " + myShoe.getColor());
        System.out.println("Brand: " + myShoe.getBrand());
        System.out.println("Size: " + myShoe.getSize());

        System.out.println(myShoe.summarize());
    }
}
