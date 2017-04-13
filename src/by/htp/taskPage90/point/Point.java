package by.htp.taskPage90.point;

public class Point {
	
	private double x;
	private double y;
	private double sped = 0;
	
	private double projectionX = 0;
	private double projectionY = 0;
	
	EquationLine equationLine;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(double x, double y, double sped, EquationLine equationLine) {
		this.x = x;
		this.y = y;
		this.sped = sped;
		this.equationLine = equationLine;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getSped() {
		return sped;
	}

	public void setSped(double sped) {
		this.sped = sped;
	}

	public EquationLine getEquationLine() {
		return equationLine;
	}

	public void setEquationLine(EquationLine equationLine) {
		this.equationLine = equationLine;
	}

	public double getProjectionX() {
		return projectionX;
	}

	public void setProjectionX(double projectionX) {
		this.projectionX = projectionX;
	}

	public double getProjectionY() {
		return projectionY;
	}

	public void setProjectionY(double projectionY) {
		this.projectionY = projectionY;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", sped=" + sped + "]";
	}

}
