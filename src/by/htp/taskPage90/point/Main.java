package by.htp.taskPage90.point;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(0.0, 0.0);
		
		Logic.identificationEquationLine(point1, 3, 1);
		System.out.println(point1.getEquationLine());
		
		point1.setSped(-1);
		Logic.findDislokation(point1, 1);
		System.out.println(point1);
		
		point1.setSped(-2);
		Logic.findDislokation(point1, 1);
		System.out.println(point1);
		
		point1.setSped(-2);
		Logic.findDislokation(point1, 2);
		System.out.println(point1);
	}
}
