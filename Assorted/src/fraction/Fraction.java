package fraction;
//********************************************************************
// Fraction.java 
//
// Represents one Fraction number with a numerator and denominator.
//********************************************************************

class DenominatorEqualsZeroException extends java.lang.Exception {
	private static final long serialVersionUID = 1L;
	public DenominatorEqualsZeroException () {
		super();
	}
	public DenominatorEqualsZeroException (String error) {
		super(error);
	}
}


public class Fraction
{

	private int n, d;

	public Fraction (int numer, int denom) {
		if (numer<0 && denom<0) {
			numer*=-1;
			denom*=-1;
		}
		if (denom==0) {
			throw new java.lang.ArithmeticException("0 in the denominator");
		}
		n=numer;
		d=denom;
		reduce();
	}

	public Fraction (int numer) {
		n=numer;
		d=1;
	}

	public static void checkZero(int num) throws DenominatorEqualsZeroException {
		if (num==0) throw new DenominatorEqualsZeroException("The denominator cannot be zero!");
	}

	private int gcd (int num, int denom) {
		if (num%denom==0) return denom;
		return gcd(denom,num%denom);
	}

	private void reduce() {
		int factor = gcd(n,d);
		n/=factor;
		d/=factor;
	}

	public int getNumerator() {
		return n;
	}
	public int getDenominator() {
		return d;
	}

	public void newNumerator(int num) {
		n=num;
	}
	public void newDenominator(int num) throws DenominatorEqualsZeroException {
		checkZero(num);
		d=num;
	}

	public Fraction reciprocal () {
		return new Fraction(d,n);
	}

	public boolean equals (Fraction op2) {
		if (n==op2.getNumerator() && d==op2.getDenominator()) return true;
		return false;
	}

	public double toDouble () {
		return (double) n/d;
	}

	public String toString () {
		return n+"/"+d;
	}

	public Fraction add (Fraction op2) {
		int numer=n*op2.getDenominator()+d*op2.getNumerator();
		int denom=d*op2.getDenominator();
		return new Fraction(numer,denom);
	}

	public Fraction subtract (Fraction op2) {
		int numer=n*op2.getDenominator()-d*op2.getNumerator();
		int denom=d*op2.getDenominator();
		return new Fraction(numer,denom);
	}

	public Fraction multiply (Fraction op2) {
		int numer= n*op2.getNumerator();
		int denom= d*op2.getDenominator();
		return new Fraction(numer,denom);
	}

	public Fraction divide (Fraction op2){
		int numer= n*op2.getDenominator();
		int denom= d*op2.getNumerator();
		return new Fraction(numer,denom);
	}
}
