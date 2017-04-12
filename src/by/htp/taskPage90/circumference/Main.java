package by.htp.taskPage90.circumference;

import by.htp.taskPage90.point.EquationLine;

public class Main {

	public static void main(String[] args) {
		
		Circumference[] mas = new Circumference[6];
		
		mas[0] = new Circumference(3, 1, 2);
		mas[1] = new Circumference(4, 5, 2);
		mas[2] = new Circumference(3, 1, 2);
		mas[3] = new Circumference(6, 2, 2);
		mas[4] = new Circumference(9, 3, 2);
		mas[5] = new Circumference(4, 4, 2);
		
		Logic.proverca(mas);
		
	}
	
	public static void sdf(EquationLine equationLine) {
		for(int i = -5; i <6; i++) {
			double x = i;
			double y = (equationLine.getC() - equationLine.getA() * x) / equationLine.getB();
			
			System.out.println(x+ " " +y);
		}
	}
}
