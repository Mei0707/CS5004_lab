import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Implementation of the Hand interface.
 * @param <C> the type of cards held in the hand
 */
class HandImpl<C> implements Hand<C> {
    private final ArrayList<C> cards;

    /**
     * Constructs an empty hand.
     */
    public HandImpl() {
        this.cards = new ArrayList<>();
    }

    /**
     * Adds a card to the hand.
     * @param card the card to add
     */
    public void add(C card) {
        cards.add(card);
    }

    /**
     * Discards a card from the hand at the specified index.
     * @param index the index of the card to discard
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public void discard(int index) {
        if (index >= 0 && index < cards.size()) {
            cards.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    /**
     * Retrieves the card at the specified index from the hand.
     * @param index the index of the card to retrieve
     * @return the card at the specified index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public C get(int index) {
        if (index >= 0 && index < cards.size()) {
            return cards.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    /**
     * Returns the number of cards in the hand.
     * @return the number of cards in the hand
     */
    public int getSize() {
        return cards.size();
    }

    /**
     * Checks if the hand is empty.
     * @return true if the hand is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    /**
     * Finds the index of a specific card in the hand.
     * @param card the card to search for
     * @return the index of the card, or -1 if not found
     */
    @Override
    public int find(C card) {
        return cards.indexOf(card);
    }

    /**
     * Sorts the cards in the hand using the specified comparator.
     * @param comparator the comparator to use for sorting
     */
    @Override
    public void sortHand(Comparator<C> comparator) {
        cards.sort(comparator);
    }

    /**
     * Retrieves a new hand containing cards that satisfy the specified predicate.
     * @param predicate the predicate to filter cards
     * @return a new hand containing filtered cards
     */
    @Override
    public Hand<C> getHand(Predicate<C> predicate) {
        HandImpl<C> filteredHand = new HandImpl<>();
        for (C card : cards) {
            if (predicate.test(card)) {
                filteredHand.add(card);
            }
        }
        return filteredHand;
    }

    /**
     * Calculates the sum of ranks of cards in the hand.
     * @return the sum of ranks of cards
     */
    @Override
    public int rankSum() {
        int sum = 0;
        for (C card : cards) {
            if (card instanceof Card) {
                sum += ((Card) card).getRank();
            }
        }
        return sum;
    }

    /**
     * Maps the cards in the hand to a new type using the specified function.
     * @param function the function to map cards to a new type
     * @param <D>      the target type of the mapping
     * @return a new hand containing mapped cards
     */
    @Override
    public <D> Hand<D> getMap(Function<C, D> function) {
        HandImpl<D> mappedHand = new HandImpl<>();
        for (C card : cards) {
            mappedHand.add(function.apply(card));
        }
        return mappedHand;
    }
}
