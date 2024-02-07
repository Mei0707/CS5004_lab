//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in th
public interface Fraction{
    /**
     * Get the numerator of the fraction.
     * @return the numerator of the fraction
     */
    int getNumerator();

    /**
     * Setter for the numerator of the fraction.
     * @param numerator value
     */
    void setNumerator(int numerator);

    /**
     * Get the denominator of the fraction.
     * @return the denominator of the fraction.
     */
    int getDenominator();

    /**
     * Setter for the denominator of the fraction.
     * @param denominator value
     * @throws IllegalArgumentException if the denominator is not positive
     */
    void setDenominator(int denominator) throws IllegalArgumentException;

    /**
     * Returns the scientific value (decimal) of the fraction..
     * @return the decimal value of the fraction
     */
    double toDouble();

    /**
     * Returns a String representation of the fraction in simplest form.
     * @return the String representation of the fraction.
     */
    String toString();

    /**
     * Returns the reciprocal of this fraction.
     * @return the reciprocal of this fraction.
     */
    Fraction reciprocal();

    /**
     * Adds this fraction to this one.
     * @param other fraction.
     * @return the sum of this fraction of the other.
     */
    Fraction add(Fraction other);

    /**
     * Compares two fractions.
     * @param other fraction
     * @return eturns a negative integer if (this < other), a positive integer if (this > other) and 0 otherwise
     */
    int compareTo(Fraction other);
}


