import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Represents a generic hand of cards.
 * @param <C> the type of cards held in the hand
 */
interface Hand<C> {
    /**
     * Adds a card to the hand.
     * @param card the card to add
     */
    void add(C card);

    /**
     * Discards a card from the hand at the specified index.
     * @param index the index of the card to discard
     */
    void discard(int index);

    /**
     * Retrieves the card at the specified index from the hand.
     * @param index the index of the card to retrieve
     * @return the card at the specified index
     */
    C get(int index);

    /**
     * Returns the number of cards in the hand.
     * @return the number of cards in the hand
     */
    int getSize();

    /**
     * Checks if the hand is empty.
     * @return true if the hand is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Finds the index of a specific card in the hand.
     * @param card the card to search for
     * @return the index of the card, or -1 if not found
     */
    int find(C card);

    /**
     * Sorts the cards in the hand using the specified comparator.
     * @param comparator the comparator to use for sorting
     */
    void sortHand(Comparator<C> comparator);

    /**
     * Retrieves a new hand containing cards that satisfy the specified predicate.
     * @param predicate the predicate to filter cards
     * @return a new hand containing filtered cards
     */
    Hand<C> getHand(Predicate<C> predicate);

    /**
     * Calculates the sum of ranks of cards in the hand.
     * @return the sum of ranks of cards
     */
    int rankSum();

    /**
     * Maps the cards in the hand to a new type using the specified function.
     * @param function the function to map cards to a new type
     * @param <D>      the target type of the mapping
     * @return a new hand containing mapped cards
     */
    <D> Hand<D> getMap(Function<C, D> function);
}
