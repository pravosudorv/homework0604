package by.htp.taskPage90.fraction;

public class Doing {

		public static void commonDenominator(Fraction a, Fraction b) {
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
