import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Comparator;

/**
 * JUnit test class for testing the functionality of the HandImpl class and related operations on cards.
 */
public class CardHandtest {

    @Test
    public void testCardEquality() {
        // Test if two cards with the same suit and rank are considered equal
        Card card1 = new Card(Suit.CLUBS, 2);
        Card card2 = new Card(Suit.CLUBS, 2);
        assertEquals(card1, card2);

        // Test if two cards with different suits and ranks are not considered equal
        Card card3 = new Card(Suit.HEARTS, 3);
        assertNotEquals(card1, card3);
    }

    @Test
    public void testHandAddAndGetSize() {
        // Test adding cards to the hand and getting the size of the hand
        Hand<Card> hand = new HandImpl<>();
        hand.add(new Card(Suit.CLUBS, 2));
        hand.add(new Card(Suit.DIAMONDS, 3));
        assertEquals(2, hand.getSize());
    }

    @Test
    public void testHandDiscard() {
        Hand<Card> hand = new HandImpl<>();
        hand.add(new Card(Suit.CLUBS, 2));
        hand.add(new Card(Suit.DIAMONDS, 3));
        hand.discard(1);
        assertEquals(1, hand.getSize());
        assertEquals(new Card(Suit.CLUBS, 2), hand.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testHandDiscardInvalidIndex() {
        Hand<Card> hand = new HandImpl<>();
        hand.add(new Card(Suit.CLUBS, 2));
        hand.discard(1); // Should throw IndexOutOfBoundsException
    }

    @Test
    public void testHandFind() {
        Hand<Card> hand = new HandImpl<>();
        Card card1 = new Card(Suit.CLUBS, 2);
        Card card2 = new Card(Suit.DIAMONDS, 3);
        hand.add(card1);
        hand.add(card2);
        assertEquals(0, hand.find(card1));
        assertEquals(1, hand.find(card2));
    }

    @Test
    public void testHandSort() {
        Hand<Card> hand = new HandImpl<>();
        hand.add(new Card(Suit.CLUBS, 3));
        hand.add(new Card(Suit.HEARTS, 2));
        hand.add(new Card(Suit.DIAMONDS, 5));

        // Sorting based on compareTo method
        hand.sortHand(Comparator.naturalOrder());
        assertEquals(new Card(Suit.HEARTS, 2), hand.get(0));
        assertEquals(new Card(Suit.CLUBS, 3), hand.get(1));
        assertEquals(new Card(Suit.DIAMONDS, 5), hand.get(2));

        // Sorting based on SuitComparator
        SuitComparator suitComparator = new SuitComparator();
        hand.sortHand(suitComparator);
        assertEquals(new Card(Suit.CLUBS, 3), hand.get(0));
        assertEquals(new Card(Suit.HEARTS, 2), hand.get(1));
        assertEquals(new Card(Suit.DIAMONDS, 5), hand.get(2));
    }

    @Test
    public void testHandGetHand() {
        Hand<Card> hand = new HandImpl<>();
        hand.add(new Card(Suit.CLUBS, 3));
        hand.add(new Card(Suit.HEARTS, 2));
        hand.add(new Card(Suit.DIAMONDS, 5));

        // Testing getHand with a Predicate
        Hand<Card> redCards = hand.getHand(card -> card.getColor() == Color.RED);
        assertEquals(2, redCards.getSize());
        assertEquals(new Card(Suit.HEARTS, 2), redCards.get(0));
        assertEquals(new Card(Suit.DIAMONDS, 5), redCards.get(1));
    }

    @Test
    public void testHandRankSum() {
        Hand<Card> hand = new HandImpl<>();
        hand.add(new Card(Suit.CLUBS, 3));
        hand.add(new Card(Suit.HEARTS, 2));
        hand.add(new Card(Suit.DIAMONDS, 5));

        assertEquals(3 + 2 + 5, hand.rankSum());
    }

    @Test
    public void testHandGetMap() {
        Hand<Card> hand = new HandImpl<>();
        hand.add(new Card(Suit.CLUBS, 3));
        hand.add(new Card(Suit.HEARTS, 2));
        hand.add(new Card(Suit.DIAMONDS, 5));

        // Mapping cards to their colors
        Hand<Color> colors = hand.getMap(Card::getColor);
        assertEquals(3, colors.getSize());
        assertEquals(Color.BLACK, colors.get(0));
        assertEquals(Color.RED, colors.get(1));
        assertEquals(Color.RED, colors.get(2));
    }
}