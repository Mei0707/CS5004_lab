// Interface for ListOfInts
public interface ListOfInts {
    /**
     * Adds an integer to the front of the list.
     * @param data the integer to be added
     * @return the modified list with the integer added to the front
     */
    ListOfInts prepend(int data);

    /**
     * Adds an integer to the back of the list.
     * @param data the integer to be added
     * @return the modified list with the integer added to the back
     */
    ListOfInts append(int data);

    /**
     * Inserts an integer at the specified index.
     * @param data  the integer to be inserted
     * @param index the index at which to insert the integer
     * @return the modified list with the integer inserted at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    ListOfInts insertAtIndex(int data, int index) throws IndexOutOfBoundsException;

    /**
     * Retrieves the integer at the specified index.
     * @param index the index of the integer to retrieve
     * @return the integer at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    int getDataAtIndex(int index) throws IndexOutOfBoundsException;

    /**
     * Retrieves the rest of the list excluding the first element.
     * @return the rest of the list
     */
    ListOfInts getRest();

    /**
     * Returns the length of the list.
     * @return the length of the list
     */
    int getCount();

    /**
     * Returns the sum of all elements in the list.
     * @return the sum of all elements
     */
    int getSum();
}

