/**
 * Represents an empty node in a list of integers.
 * Implements functionality for an empty list.
 */
public class EmptyNode implements ListOfInts {
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
     * @return a new list with the specified data appended
     */
    @Override
    public ListOfInts append(int data) {
        return new ElementNode(data, this);
    }

    /**
     * Inserts a new node with the given data at the specified index in the list.
     * @param data the integer data to insert into the list
     * @param index the index at which to insert the data
     * @return a new list with the data inserted at the specified index
     * @throws IndexOutOfBoundsException if the index is not zero
     */
    @Override
    public ListOfInts insertAtIndex(int data, int index) throws IndexOutOfBoundsException {
        if (index != 0) {
            throw new IndexOutOfBoundsException("Index out of range for insertion");
        } else {
            return new ElementNode(data, this);
        }
    }

    /**
     * Retrieves the data at the specified index in the list.
     * @param index the index of the data to retrieve
     * @return the data at the specified index
     * @throws IndexOutOfBoundsException since there is no data in an empty list
     */
    @Override
    public int getDataAtIndex(int index) throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException("Index out of range");
    }

    /**
     * Retrieves the rest of the list.
     * @return an empty list since there are no elements after an empty node
     */
    @Override
    public ListOfInts getRest() {
        return this;
    }

    /**
     * Retrieves the count of elements in the list, which is zero for an empty node.
     * @return the count of elements in the list, which is zero for an empty node
     */
    @Override
    public int getCount() {
        return 0;
    }

    /**
     * Retrieves the sum of elements in the list, which is zero for an empty node.
     * @return the sum of elements in the list, which is zero for an empty node
     */
    @Override
    public int getSum() {
        return 0;
    }

    /**
     * Returns a string representation of the empty node.
     * @return a string representation of the empty node
     */
    @Override
    public String toString() {
        return "EmptyNode";
    }
}
