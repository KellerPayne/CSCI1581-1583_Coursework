public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = Math.abs(numerator);
        if(numerator * denominator <= 0){
            this.numerator = this.numerator * -1;
        }
        this.denominator = Math.abs(denominator);
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public Fraction add(Fraction other){
        int numerator = this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator();
        int denominator = this.getDenominator() * other.getDenominator();

        Fraction sum = this.simplify(numerator, denominator);
        return sum;
    }

    public String toString(){
        return String.format("(%d/%d)", numerator, denominator);
    }

    public Fraction subtract(Fraction other){
        int numerator = this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator();
        int denominator = this.getDenominator() * other.getDenominator();

        Fraction difference = this.simplify(numerator, denominator);
        return difference;
    }

    public Fraction multiply(Fraction other){
        int numerator = this.getNumerator() * other.getNumerator();
        int denominator = this.getDenominator() * other.getDenominator();

        Fraction product = this.simplify(numerator, denominator);
        return product;
    }

    public Fraction divide(Fraction other){
        int numerator = this.getNumerator() * other.getDenominator();
        int denominator = this.getDenominator() * other.getNumerator();

        Fraction quotient = this.simplify(numerator, denominator);
        return quotient;
    }

    public Fraction simplify(int numerator, int denominator){
        for(int i = denominator; i > 0; i--){
            if(numerator % i == 0 && denominator % i == 0){
                numerator = numerator / i;
                denominator = denominator / i;
            }
        }
        return new Fraction(numerator, denominator);
    }
}
