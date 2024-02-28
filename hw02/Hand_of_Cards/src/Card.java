import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Represents the suit of a playing card.
 */
enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}

/**
 * Represents a playing card with a suit and rank.
 */
class Card implements Comparable<Card> {
    private final Suit suit;
    private final int rank;

    /**
     * Constructs a card with the specified suit and rank.
     * @param suit the suit of the card
     * @param rank the rank of the card (1-13)
     * @throws IllegalArgumentException if the rank is not between 1 and 13
     */
    public Card(Suit suit, int rank) {
        if (rank < 1 || rank > 13) {
            throw new IllegalArgumentException("Rank must be between 1 and 13");
        }
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Retrieves the suit of the card.
     * @return the suit of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Retrieves the rank of the card.
     * @return the rank of the card
     */
    public int getRank() {
        return rank;
    }

    /**
     * Retrieves the color of the card.
     * @return the color of the card
     */
    public Color getColor() {
        return (suit == Suit.DIAMONDS || suit == Suit.HEARTS) ? Color.RED : Color.BLACK;
    }

    /**
     * Returns a string representation of the card.
     * @return a string representation of the card
     */
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    /**
     * Checks if this card is equal to another object.
     * @param o the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }

    /**
     * Returns the hash code of the card.
     * @return the hash code of the card
     */
    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    /**
     * Compares this card with another card based on their ranks.
     * @param other the card to compare with
     * @return a negative integer, zero, or a positive integer as this card is less than, equal to, or greater than the specified card
     */
    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.rank, other.rank);
    }
}

/**
 * Represents the color of a playing card.
 */
enum Color {
    RED, BLACK
}


