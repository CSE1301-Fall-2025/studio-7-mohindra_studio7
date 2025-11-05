public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction (int inNumerator, int inDenominator) {
        numerator = inNumerator;
        denominator = inDenominator;
    }

    public Fraction recipriocal (Fraction f1) {
        Fraction f2 = new Fraction(f1.denominator, f1.numerator);
        return f2;
    }

    public Fraction simplify (Fraction f1) {
        if (f1.denominator % f1.numerator == 0) {

        }
    }

    public Fraction sum (Fraction f1, Fraction f2) {
        Fraction f3 = new Fraction (((f1.numerator * f2.denominator) + (f2.numerator * f1.denominator)), (f1.numerator * f2.denominator));
    }
}
