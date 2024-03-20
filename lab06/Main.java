import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Book {
    private String title;
    private int yearPublished;
    private float price;

    public Book(String title, int yearPublished, float price) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public float getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book 1", 2000, 15.99f));
        books.add(new Book("Book 2", 1995, 12.50f));
        books.add(new Book("Book 3", 2005, 20.00f));
        books.add(new Book("Book 4", 1998, 10.00f));
        books.add(new Book("Book 5", 2010, 25.50f));

        int yearThreshold = 2000; // Change this to the desired year

        List<Float> prices = books.stream()
                .filter(book -> book.getYearPublished() < yearThreshold)
                .map(Book::getPrice)
                .collect(Collectors.toList());

        System.out.println(prices);
    }
}
