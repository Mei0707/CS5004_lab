import org.junit.Test;
import static org.junit.Assert.*;

public static class ListTest {

    @Test
    public void testPrepend() {
        ListOfInts list = new EmptyNode();
        list = list.prepend(3);
        list = list.prepend(2);
        list = list.prepend(1);
        assertEquals("1, 2, 3, EmptyNode", list.toString());
    }

    @Test
    public void testAppend() {
        ListOfInts list = new EmptyNode();
        list = list.append(1);
        list = list.append(2);
        list = list.append(3);
        assertEquals("1, 2, 3, EmptyNode", list.toString());
    }

    @Test
    public void testInsertAtIndex() {
        ListOfInts list = new EmptyNode();
        list = list.insertAtIndex(1, 0);
        list = list.insertAtIndex(3, 1);
        list = list.insertAtIndex(2, 1);
        assertEquals("1, 2, 3, EmptyNode", list.toString());
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertAtIndexOutOfBounds() {
        ListOfInts list = new EmptyNode();
        list = list.insertAtIndex(1, 2);
    }

    @Test
    public void testGetDataAtIndex() {
        ListOfInts list = new EmptyNode();
        list = list.append(1);
        list = list.append(2);
        list = list.append(3);
        assertEquals(2, list.getDataAtIndex(1));
        }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataAtIndexOutOfBounds() {
        ListOfInts list = new EmptyNode();
        list.getDataAtIndex(0);
    }

    @Test
    public void testGetRest() {
        ListOfInts list = new EmptyNode();
        list = list.append(1);
        list = list.append(2);
        list = list.append(3);
        assertEquals("2, 3, EmptyNode", list.getRest().toString());
    }

    @Test
    public void testGetCount() {
        ListOfInts list = new EmptyNode();
        list = list.append(1);
        list = list.append(2);
        list = list.append(3);
        assertEquals(3, list.getCount());
    }

    @Test
    public void testGetSum() {
        ListOfInts list = new EmptyNode();
        list = list.append(1);
        list = list.append(2);
        list = list.append(3);
        assertEquals(6, list.getSum());
    }

public void main() {
}

