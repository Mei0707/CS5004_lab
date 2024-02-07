/**
 * Implement the Fraction interface and create a fraction with an integer numerator
 * and a positive integer denominator.
 */
public class FractionImpl implements Fraction {
    private int numerator;
    private int denominator;

    /**
     * Constructs a FractionImpl object with the given numerator and denominator.
     * Throws an IllegalArgumentException if the denominator is not positive.
     *
     * @param numerator   the numerator of the fraction
     * @param denominator the denominator of the fraction (must be positive)
     * @throws IllegalArgumentException if the denominator is not positive
     */
    public FractionImpl(int numerator, int denominator) {
        if (denominator <= 0)
            throw new IllegalArgumentException("Denominator must be positive");

        this.numerator = numerator;
        this.denominator = denominator;

    }

    /**
     * Get the numerator of the fraction.
     * @return the numerator of the fraction
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Setter for the numerator of the fraction.
     * @param numerator value
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Get the denominator of the fraction.
     * @return the denominator of the fraction.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Sets the denominator of the fraction.
     * Throws an IllegalArgumentException if the denominator is not positive.
     * @param denominator the new denominator value (must be positive)
     * @throws IllegalArgumentException if the denominator is not positive
     */
    public void setDenominator(int denominator) {
        if (denominator <= 0)
            throw new IllegalArgumentException("Denominator must be positive");
        this.denominator = denominator;
    }

    /**
     * Converts the fraction to its double representation.
     * @return the double representation of the fraction
     */
    public double toDouble() {
        return (double) numerator / denominator;
    }

    /**
     * Returns a string representation of the fraction in simplest form.
     * @return the string representation of the fraction
     */
    public String toString() {
        int gcd = gcd(numerator, denominator);
        return (numerator / gcd) + " / " + (denominator / gcd);
    }


    /**
     * Returns the reciprocal of the fraction.
     * Throws an ArithmeticException if the numerator is zero.
     * @return the reciprocal of the fraction
     * @throws ArithmeticException if the numerator is zero
     */
    public Fraction reciprocal() {
        if (numerator == 0) {
            throw new ArithmeticException("Cannot take reciprocal of zero");
        }
        return new FractionImpl(denominator, numerator);
    }

    /**
     * Adds the given fraction to this fraction and returns the result.
     * @param other the fraction to add
     * @return the sum of the fractions
     */
    @Override
    public Fraction add(Fraction other) {
        int commonDenominator = this.denominator * other.getDenominator();
        int sumNumerator = (this.numerator * other.getDenominator()) + (other.getNumerator() * this.denominator);
        return new FractionImpl(sumNumerator, commonDenominator);
    }

    /**
     * Compares this fraction with the given fraction.
     * @param other the fraction to compare with
     * @return a negative integer if this fraction is less than the other fraction,
     *         a positive integer if this fraction is greater than the other fraction,
     *         or zero if both fractions are equal
     */
    public int compareTo(Fraction other) {
        int thisNumerator = this.numerator * other.getDenominator();
        int otherNumerator = other.getNumerator() * this.denominator;
        return Integer.compare(thisNumerator, otherNumerator);
    }


    /**
     * Finds the greatest common divisor of two integers using Euclid's algorithm.
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of the two integers
     */
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
