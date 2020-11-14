package ru.svetashov.math;

import ru.svetashov.exception.FractionException;

import java.util.Objects;

final public class Fraction extends Number{
    private int num;
    private int den;

    public Fraction(int num, int den) {
        this.num = num;
        if (den < 1)
            throw new IllegalArgumentException("Wrong denominator");
        this.den = den;
    }

    public Fraction sum(Fraction f) {
        if (den == f.den) {
            return new Fraction(num + f.num, den);
        } else
            return new Fraction((num * f.den) + (f.num * den), den * f.den);
    }

    public Fraction minus(Fraction f) {
        if (den == f.den) {
            return new Fraction(num - f.num, den);
        } else
            return new Fraction((num * f.den) - (f.num * den), den * f.den);
    }

    public Fraction multiply(Fraction f) {
        return new Fraction(num * f.num, den * f.den);
    }

    public Fraction divide(Fraction f) {
        return new Fraction(num * f.den, den * f.num);
    }

    public int intValue(){
        if(den == 0) throw new FractionException("", new ArithmeticException());
        return num/den;
    }

    public long longValue(){ return (long)num / den; }

    public float floatValue(){ return (float)num / den; }

    public double doubleValue(){ return  (double)num / den; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return num == fraction.num &&
                den == fraction.den;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, den);
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}
