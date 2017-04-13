package by.htp.taskPage90.fraction;

public class Main {
	public static void main(String[] args) {
		Fraction[] masFraction = new Fraction[7];
		
		masFraction[0] = new Fraction(1, 6);
		masFraction[1] = new Fraction(2, 3);
		masFraction[2] = new Fraction(1, 5);
		masFraction[3] = new Fraction(1, 3);
		masFraction[4] = new Fraction(2, 8);
		masFraction[5] = new Fraction(2, 4);
		masFraction[6] = new Fraction(2, 4);
		
		Print.print(masFraction);
		System.out.println();
		Logic.transformation(masFraction);
		Print.print(masFraction);
	}
}
