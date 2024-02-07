public class ElementNode implements IListOfBooks {
    private int data;
    private IListOfBooks rest;

    public ElementNode(int data, IListOfBooks rest) {
        this.data = data;
        this.rest = rest;
    }

    @Override
    public IListOfBooks prepend(int data) {
        return new ElementNode(data, this);
    }

    @Override
    public IListOfBooks append(int data) {
        rest = rest.append(data);
        return this;
    }

    @Override
    public IListOfBooks insertAtIndex(int data, int index) {
        if (index == 0) {
            return prepend(data);
        }
        rest = rest.insertAtIndex(data, index - 1);
        return this;
    }

    @Override
    public int getDataAtIndex(int index) {
        if (index == 0) {
            return data;
        }
        return rest.getDataAtIndex(index - 1);
    }

    @Override
    public IListOfBooks getRest() {
        return rest;
    }

    @Override
    public int getCount() {
        return 1 + rest.getCount();
    }

    @Override
    public int getSum() {
        return data + rest.getSum();
    }

    @Override
    public String toString() {
        if (rest instanceof EmptyNode) {
            return String.valueOf(data);
        }
        return data + ", " + rest.toString();
    }

}
