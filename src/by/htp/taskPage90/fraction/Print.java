package by.htp.taskPage90.fraction;

public class Print {
	public static void print(Fraction a) {
		System.out.print(a.getNumerator() + "/" + a.getDenominator());
	}

	public static void println(Fraction a) {
		System.out.println(a.getNumerator() + "/" + a.getDenominator());
	}

	public static void print(Fraction[] a) {
		for (int i = 0; i < a.length; i++) {
		print(a[i]);
		System.out.print("  ");
		}
	}
	
}
