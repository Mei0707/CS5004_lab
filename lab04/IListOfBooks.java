import java.awt.print.Book;

public interface IListOfBooks {

    /**
     * Add an integer to the front of the list.
     *
     * @param /the integer to be added.
     * @return a new list with the new data add to the front.
     */
    IListOfBooks prepend(int data);

    /**
     * Inserts an integer at the end of the list.
     *
     * @param /the integer to be added.
     * @return a new list with new data add to the end.
     */
    IListOfBooks append(int data);

    /**
     * Inserts an integer at the specified index.
     *
     * @param /the integer to be added.
     * @param /the index at where to insert the data.
     * @return a new list with the data inserted at the specified index.
     */
    IListOfBooks insertAtIndex(int data, int index);

    /**
     * Retrieves the data at the specified index.
     *
     * @param /the index at where to retrive the data.
     * @return the data at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    int getDataAtIndex(int index) throws IndexOutOfBoundsException;

    /**
     * Retrives the rest of the data in the list.
     *
     * @param /the list to retrive.
     * @return the rest of the list.
     */
    IListOfBooks getRest();

    /**
     * Get the length of the list.
     *
     * @return the length of the list.
     */
    int getCount();

    /**
     * Get the sum of all elements in the list.
     *
     * @return the sum of all elements in the list.
     */
    int getSum();
}
