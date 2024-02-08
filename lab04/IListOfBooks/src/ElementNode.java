/**
 * Represents a node in a list of integers.
 * Implements functionality to access elements in the list.
 */
public class ElementNode implements ListOfInts {
    private int data;
    private ListOfInts rest;

    /**
     * Constructs an ElementNode with the specified data and the rest of the list.
     * @param data the integer data to be stored in the node
     * @param rest the rest of the list after this node
     */
    public ElementNode(int data, ListOfInts rest) {
        this.data = data;
        this.rest = rest;
    }

    /**
     * Prepends a new node with the given data to the list.
     * @param data the integer data to prepend to the list
     * @return a new list with the specified data prepended
     */
    @Override
    public ListOfInts prepend(int data) {
        return new ElementNode(data, this);
    }

    /**
     * Appends a new node with the given data to the end of the list.
     * @param data the integer data to append to the list
     * @return the updated list with the data appended
     */
    @Override
    public ListOfInts append(int data) {
        rest = rest.append(data);
        return this;
    }

    /**
     * Inserts a new node with the given data at the specified index in the list.
     * @param data the integer data to insert into the list
     * @param index the index at which to insert the data
     * @return the updated list with the data inserted at the specified index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    @Override
    public ListOfInts insertAtIndex(int data, int index) throws IndexOutOfBoundsException {
        if (index == 0) {
            return new ElementNode(data, this);
        } else {
            rest = rest.insertAtIndex(data, index - 1);
            return this;
        }
    }

    /**
     * Retrieves the data at the specified index in the list.
     * @param index the index of the data to retrieve
     * @return the data at the specified index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    @Override
    public int getDataAtIndex(int index) throws IndexOutOfBoundsException {
        if (index == 0) {
            return data;
        } else {
            return rest.getDataAtIndex(index - 1);
        }
    }

    /**
     * Retrieves the rest of the list after this node.
     * @return the rest of the list after this node
     */
    @Override
    public ListOfInts getRest() {
        return rest;
    }

    /**
     * Calculates and returns the number of elements in the list.
     * @return the number of elements in the list
     */
    @Override
    public int getCount() {
        return 1 + rest.getCount();
    }

    /**
     * Calculates and returns the sum of all elements in the list.
     * @return the sum of all elements in the list
     */
    @Override
    public int getSum() {
        return data + rest.getSum();
    }
    /**
     * Returns a string representation of the list.
     * @return a string representation of the list
     */
    @Override
    public String toString() {
        return data + ", " + rest.toString();
    }
}