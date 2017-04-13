package by.htp.taskPage90.fraction;

public class Logic {

	public static void transformation(Fraction[] mas) {
		if (mas != null) {
			for (int i = 0; i < mas.length; i += 2) {
				if(i != mas.length - 1) {
				mas[i] = addition(mas[i], mas[i+1]);
				}
			}
		}
	}
	
	private static Fraction addition(Fraction a, Fraction b) {
		Fraction c = new Fraction();

		a.decumulation();
		b.decumulation();
		commonDenominator(a, b);

		c.setNumerator(a.getNumerator() + b.getNumerator());
		c.setDenominator(a.getDenominator());
		return c;
	}

	private static void commonDenominator(Fraction a, Fraction b) {
		int za;
		int zb;
		int z = Math.max(a.getDenominator(), b.getDenominator());
		int i = 2;
		while (true) {
			if (z % a.getDenominator() != 0 && z % b.getDenominator() != 0) {
			} else {
				za = z / a.getDenominator();
				zb = z / b.getDenominator();
				if (za * a.getDenominator() == zb * b.getDenominator()) {
					break;
				}
			}
			z = z * i;
			i++;
		}
		a.setNumerator(a.getNumerator() * za);
		a.setDenominator(a.getDenominator() * za);
		b.setNumerator(b.getNumerator() * zb);
		b.setDenominator(b.getDenominator() * zb);
	}

	
}
