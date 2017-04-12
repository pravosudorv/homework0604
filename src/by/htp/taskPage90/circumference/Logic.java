package by.htp.taskPage90.circumference;

import by.htp.taskPage90.point.EquationLine;

public class Logic {
	public static double area(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}

	public static double perimeter(double radius) {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public static void proverca(Circumference[] mas) {
		EquationLine equationLine;
		
		for (int j = 0; j < mas.length; j++) {
			for (int i = j; i < mas.length; i++) {
				equationLine = Logic.identificationEquationLine(mas[j], mas[i]);
				if(equationLine != null) {
					if(pointBelongsLine(equationLine, mas[i])) {
						System.out.println(mas[i]);
					}
				} else {
					continue;
				}
			}
		}
	}

	private static boolean pointBelongsLine(EquationLine equationLine, Circumference circumference) {
		if (equationLine != null) {
			double a = equationLine.getA();
			double b = equationLine.getB();
			double c = equationLine.getC();
			double result;

			result = a * circumference.getCenterX() + b * circumference.getCenterY() + c;

			if (result == 0) {
				return true;
			}
		}return false;
	}

	private static EquationLine identificationEquationLine(Circumference circumference1, Circumference circumference2) {
		double k;
		double bK;
		double b = -1;

		if (!circumference1.equals(circumference2)) {

			/** yravnenie yglovogo koficienta, y = k * x + bK */
			double xKatet = circumference2.getCenterX() - circumference1.getCenterX();
			double yKatet = circumference2.getCenterY() - circumference1.getCenterY();

			if (xKatet != 0) {
				k = (yKatet) / (xKatet);
				bK = k * circumference1.getCenterX() - circumference1.getCenterY();

			} else {
				k = 0;
				bK = circumference1.getCenterY();
			}
			return new EquationLine(k, b, bK);
		} else {
			return null;
		}
	}

}
