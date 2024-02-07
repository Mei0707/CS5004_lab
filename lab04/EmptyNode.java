import java.awt.print.Book;

public abstract class EmptyNode implements IListOfBooks {
    public IListOfBooks prepend(int data){

        return new ElementNode(data, this);
    }

    public IListOfBooks append(int data) {

        return new ElementNode(data, this);
    }

    public IListOfBooks insertAtIndex(int data, int index) {
        if (index != 0) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return prepend(data);
    }

    @Override
    public int getDataAtIndex(int index) throws IndexOutOfBoundsException {
        return 0;
    }

    public IListOfBooks getRest(IListOfBooks lst) {
        return this;
    }

    public int getSum() {
        return 0;
    }

    public int getCount() {
        return 0;
    }
    public String toString() {
        return "";
    }

    public abstract IListOfBooks append(Book book);
}
