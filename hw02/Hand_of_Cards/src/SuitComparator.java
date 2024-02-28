import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Compares two cards based on the order of their suits.
 */
class SuitComparator implements Comparator<Card> {
    private final Map<Suit, Integer> suitOrder = new HashMap<>();

    /**
     * Constructs a SuitComparator and initializes the order of suits.
     */
    public SuitComparator() {
        suitOrder.put(Suit.CLUBS, 0);
        suitOrder.put(Suit.HEARTS, 1);
        suitOrder.put(Suit.DIAMONDS, 2);
        suitOrder.put(Suit.SPADES, 3);
    }

    /**
     * Compares two cards based on the order of their suits.
     * @param card1 the first card to compare
     * @param card2 the second card to compare
     * @return a negative integer, zero, or a positive integer as the first card is less than, equal to, or greater than the second card
     */
    @Override
    public int compare(Card card1, Card card2) {
        return Integer.compare(suitOrder.get(card1.getSuit()), suitOrder.get(card2.getSuit()));
    }
}