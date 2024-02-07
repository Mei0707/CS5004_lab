import static org.junit.Assert.*;
import org.junit.*;

import java.awt.print.Book;

public class ListOfBooksTest {
    @Test
    public void testAppend() {
        IListOfBooks list = new EmptyNode() {
            @Override
            public IListOfBooks getRest() {
                return null;
            }

            @Override
            public IListOfBooks append(Book book) {
                return null;
            }
        };
        list = list.append(new Book());
        assertEquals(1, list.getCount());
        assertEquals("Title", list.getDataAtIndex(0).getTitle());
    }

    @Test
    public void testInsertAtIndex() {
        IListOfBooks list = new EmptyNode() {
            @Override
            public IListOfBooks getRest() {
                return null;
            }

            @Override
            public IListOfBooks append(Book book) {
                return null;
            }
        };
        list = list.append(new Book("Book1", "Author1"))
                .append(new Book("Book3", "Author3"))
                .append(new Book("Book4", "Author4"));
        list = list.insertAtIndex(new Book("Book2", "Author2"), 1);
        assertEquals(4, list.getCount());
        assertEquals("Book2", list.getDataAtIndex(1).getTitle());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataAtIndexOutOfBounds() {
        IListOfBooks list = new EmptyNode();
        list.getDataAtIndex(0);
    }

    @Test
    public void testGetRest() {
        IListOfBooks list = new EmptyNode();
        list = list.append(new Book("Book1", "Author1"))
                .append(new Book("Book2", "Author2"))
                .append(new Book("Book3", "Author3"));
        IListOfBooks rest = list.getRest();
        assertEquals(2, rest.getCount());
        assertEquals("Book2", rest.getDataAtIndex(0).getTitle());
    }

    @Test
    public void testGetCount() {
        IListOfBooks list = new EmptyNode();
        list = list.append(new Book("Book1", "Author1"))
                .append(new Book("Book2", "Author2"))
                .append(new Book("Book3", "Author3"));
        assertEquals(3, list.getCount());
    }

    @Test
    public void testGetSum() {
        IListOfBooks list = new EmptyNode();
        list = list.append(new Book("Book1", "Author1"))
                .append(new Book("Book2", "Author2"))
                .append(new Book("Book3", "Author3"));
        // Assuming the sum is the count of books
        assertEquals(3, list.getSum());
    }
}