package by.htp.taskPage90.point;

public class Logic {
	
	public static double computingSped(Point point1, double x, double y, int time) {
		double sped;
		double way;
		
		way = computingWay(point1, x , y);
	
		sped = way / time;
		return sped;
	}
	
	public static double computingAcceleration(Point point, double x, double y, int time) {
		double spedPoint2;
		double deltaSped;
		double deltaTime;
		double acceleration;
		
		spedPoint2 = computingSped(point, x, y, time);
		
		deltaSped = spedPoint2 - point.getSped();
		
		deltaTime = time;
		
		acceleration = deltaSped / deltaTime;
		return acceleration;
	}
	
	public static void identificationEquationLine(Point point1, double x, double y) {
		double k;
		double bK;
		double b = -1;
	
		/**  yravnenie yglovogo koficienta,  y = k * x + bK */
		double xKatet = x - point1.getX();
		double yKatet = y - point1.getY();
		
		k = (yKatet) / (xKatet);
		bK = k*point1.getX() - point1.getY();
		
		point1.setEquationLine(new EquationLine(k, b, bK));
		
		double vector = Math.hypot(xKatet, yKatet);
		point1.setProjectionX(xKatet/vector);
		point1.setProjectionY(yKatet/vector);
	}
	
	public static boolean presumablyInterception(EquationLine equationLine1, EquationLine equationLine2) {
		double a1b2 = equationLine1.getA() * equationLine2.getB();
		double a2b1 = equationLine2.getA() * equationLine1.getB();
		if(a1b2 != a2b1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double computingWay(Point point1, Point point2) {
		double way;
		way = Math.hypot((point2.getX() - point1.getX()), (point2.getY() - point1.getY()));
		return way;
	}
	
	public static double computingWay(Point point1, double x, double y) {
		double way;
		way = Math.hypot((x - point1.getX()), (y - point1.getY()));
		return way;
	}
	
	public static double distanceBetweenPoint(Point point1, Point point2, int time_s) {
		findDislokation(point1, time_s);
		findDislokation(point2, time_s);
		return computingWay(point1, point2);
	}
	
	public static void findDislokation(Point point, int time_s) {
		
		double newX = point.getProjectionX() * point.getSped() * time_s;
		double newY = point.getProjectionY() * point.getSped() * time_s;
		point.setX(point.getX() + newX);
		point.setY(point.getY() + newY);
	}
	
}
