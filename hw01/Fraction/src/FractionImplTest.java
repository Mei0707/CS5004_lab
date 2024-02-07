import static org.junit.Assert.*;
import org.junit.*;

public class FractionImplTest {
    @Test
    public void testFractionCreation() {
        Fraction f = new FractionImpl(3, 5);
        assertEquals(3, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    // Test exception thrown for zero denominator
    @Test(expected = IllegalArgumentException.class)
    public void testZeroDenominator() {
        Fraction f = new FractionImpl(3, 0);
    }

    // Test string representation of fraction
    @Test
    public void testToString() {
        Fraction f = new FractionImpl(6, 8);
        assertEquals("3 / 4", f.toString());
    }

    @Test
    public void testToDouble() {
        Fraction f = new FractionImpl(3, 5);
        assertEquals(0.6, f.toDouble(), 0.001);
    }

    @Test
    public void testReciprocal() {
        Fraction f = new FractionImpl(3, 5);
        Fraction reciprocal = f.reciprocal();
        assertEquals(5, reciprocal.getNumerator());
        assertEquals(3, reciprocal.getDenominator());
    }

    @Test
    public void testAdd() {
        Fraction f1 = new FractionImpl(1, 2);
        Fraction f2 = new FractionImpl(1, 3);
        Fraction sum = f1.add(f2);
        assertEquals(5, sum.getNumerator());
        assertEquals(6, sum.getDenominator());
    }

    @Test
    public void testCompareTo() {
        Fraction f1 = new FractionImpl(1, 2);
        Fraction f2 = new FractionImpl(2, 3);
        assertTrue(f1.compareTo(f2) < 0);
    }
}