package by.htp.taskPage90.circumference;

public class Circumference {
	private double centerX;
	private double centerY;
	private double radius;
	private double area;
	private double perimeter;
	
	public Circumference( double centerX, double centerY, double radius){
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.area = Logic.area(radius);
		this.perimeter = Logic.perimeter(radius);
	}

	public double getCenterX() {
		return centerX;
	}

	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}

	public double getCenterY() {
		return centerY;
	}

	public void setCenterY(double centerY) {
		this.centerY = centerY;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.area = Logic.area(radius);
		this.perimeter = Logic.perimeter(radius);
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(centerX);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(centerY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circumference other = (Circumference) obj;
		if (Double.doubleToLongBits(centerX) != Double.doubleToLongBits(other.centerX))
			return false;
		if (Double.doubleToLongBits(centerY) != Double.doubleToLongBits(other.centerY))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "Circumference [X=" + centerX + ", Y=" + centerY + ", radius=" + radius + ", area=" + area
				+ ", perimeter=" + perimeter + "]";
	}
	
	
}
