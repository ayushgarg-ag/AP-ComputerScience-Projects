package FractionProject;

/**
 * @desciption Fraction is a class to model fractions
 * @date 9/20/17
 * @author agarg01
 */
public class Fraction {
	private int numerator;
	private int denominator;
	
	/**
	 * Sets the instance variables of numerator and denominator to n and d, respectively
	 * @param n the numerator
	 * @param d the denominator
	 */
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	/**
	 * Returns the numerator
	 * @return numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Sets the numerator
	 * @param n the numerator
	 */
	public void setNumerator(int n) {
		this.numerator = n;
	}

	/**
	 * Returns the denominator
	 * @return denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Sets the denominator
	 * @param d the denominator
	 */
	public void setDenominator(int d) {
		this.denominator = d;
	}
	
	/**
	 * Changes the number into a string (numerator / denominator) to display
	 */
	public String toString() {
		if (numerator != 0 && denominator ==0) {
			return "infinity";
		}
		else if (denominator==0 && numerator == 0) {
			return "undefined";
		}
		return numerator+"/"+denominator;
		
	}
	
	/**
	 * Adds two fractions
	 * @param other another Fraction
	 * @return Fraction
	 */
	public Fraction add (Fraction other) { // do you need to write public before Fraction
		int num = (numerator * other.getDenominator())+(denominator * other.getNumerator());
		int den = (denominator * other.getDenominator());
		Fraction f3 = new Fraction (num, den);
		return f3;
	}
	
	/**
	 * Subtracts two fractions
	 * @param other another Fraction
	 * @return Fraction
	 */
	public Fraction subtract (Fraction other) { // do you need to write public before Fraction
		int num = (numerator * other.getDenominator())-(denominator * other.getNumerator());
		int den = (denominator * other.getDenominator());
		Fraction f3 = new Fraction (num, den);
		return f3;
	}
	
	/**
	 * Multiplies two fractions
	 * @param other another Fraction
	 * @return Fraction
	 */
	public Fraction multiply (Fraction other) { // do you need to write public before Fraction
		int num = (numerator * other.getNumerator());
		int den = (denominator * other.getDenominator());
		Fraction f3 = new Fraction (num, den);
		return f3;
	}
	
	/**
	 * Divides two fractions
	 * @param other another Fraction
	 * @return Fraction
	 */
	public Fraction divide (Fraction other) { // do you need to write public before Fraction
		int num = (numerator * other.getDenominator());
		int den = (denominator* other.getNumerator());
		Fraction f3 = new Fraction (num, den);
		return f3;
	}
	
	/**
	 * 
	 * @param o another Fraction
	 * @return boolean (true or false)
	 */
	public boolean equals (Fraction o) {
	//  write your code here
		if ((numerator * o.getDenominator()) == (denominator * o.getNumerator())) {
			return true;
		}
		else {
			return false;
		}
	}


}
