package by.htp.taskPage90.point;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(5,  -3);
		Logic.identificationEquationLine(point1, 3, -6);
		
		double spedPoint1 = Logic.computingSped(point1, 3, -6, 10);
		point1.setSped(spedPoint1);
		System.out.println(spedPoint1);
		
		double accelerationPoint1 = Logic.computingAcceleration(point1, 3, 6, 6);
		System.out.println(accelerationPoint1);
		
		Point point2 = new Point(-4, -5);
		Logic.identificationEquationLine(point1, 3, 1);
		point1.setSped(10);
		
		System.out.println(Logic.presumablyInterception(point1.getEquationLine(), point2.getEquationLine()));
		
		System.out.println(Logic.distanceBetweenPoint(point1, point2, 10));
	}
}
