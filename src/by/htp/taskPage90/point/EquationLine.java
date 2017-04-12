package by.htp.taskPage90.point;

public class EquationLine {
	
	/** yravnenie imeet vid a*x + b*y + c = 0 */
	private double a;
	private double b;
	private double c;
	
	public EquationLine(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	@Override
	public String toString() {
		return "EquationLine [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}
