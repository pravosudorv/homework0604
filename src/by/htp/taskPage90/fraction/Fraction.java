package by.htp.taskPage90.fraction;

public class Fraction {
	private int numerator = 1;
	private int denominator = 1;
	
	public Fraction(){};
	
	public Fraction(int a, int b){
		numerator = a;
		setDenominator(b);
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int a) {
		numerator = a;
	}

	public void setDenominator(int b) {
		if (b != 0) {
			denominator = b;
		}
		if (b < 0) {
			denominator = Math.abs(b);
		}
	}

	public void decumulation() {
		int z;
		for (z = Math.abs(denominator); z > 0; z--) {
			if (denominator % z == 0 && numerator % z == 0) {
				break;
			}
		}
		numerator = numerator / z;
		denominator = denominator / z;
	}
}
