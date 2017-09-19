package FractionProject;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int n) {
		this.numerator = n;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int d) {
		this.denominator = d;
	}
	
	public String toString() {
		return numerator+" / "+denominator;
	}
	
	public Fraction add (Fraction other) { // do you need to write public before Fraction
		int num = (numerator * other.getDenominator())+(denominator* other.getNumerator());
		int den = (denominator * other.getDenominator());
		Fraction f3 = new Fraction (num, den);
		return f3;
	}
	
	public Fraction subtract (Fraction other) { // do you need to write public before Fraction
		int num = (numerator * other.getDenominator())-(denominator* other.getNumerator());
		int den = (denominator * other.getDenominator());
		Fraction f3 = new Fraction (num, den);
		return f3;
	}
	
	public Fraction multiply (Fraction other) { // do you need to write public before Fraction
		int num = (numerator * other.getNumerator());
		int den = (denominator * other.getDenominator());
		Fraction f3 = new Fraction (num, den);
		return f3;
	}
	
	public Fraction divide (Fraction other) { // do you need to write public before Fraction
		int num = (numerator * other.getDenominator());
		int den = (denominator* other.getNumerator());
		Fraction f3 = new Fraction (num, den);
		return f3;
	}
	
	
	
	
	
//	public boolean equals (Fraction o) {
//	//  write your code here
//	}

}
