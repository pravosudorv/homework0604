package by.htp.taskPage51;

public class C12 {
	private int min;
	private int x;
	private int y;

	public int getMin() {
		return min;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void minElement(int[][] mas) {
		min = mas[0][0];
		for (int j = 0; j < mas.length; j++) {
			for (int i = 0; i < mas[j].length; i++) {
				if (min > mas[j][i]) {
					min = mas[j][i];
					x = j;
					y = i;
				}
			}
		}
	}

	public void zamena(int[][] mas, int newX, int newY) {
		zamenaPoVerticali(mas, newX);
		zamenaPoGorizantali(mas, newY);
	}

	private void zamenaPoVerticali(int[][] mas, int newX) {
		int[] temp = mas[newX];
		mas[newX] = mas[x];
		mas[x] = temp;
	}
	
	private void zamenaPoGorizantali(int[][] mas, int newY) {
		for(int j = 0; j < mas.length; j++) {
			int temp = mas[j][newY];
			mas[j][newY] = mas[j][y];
			mas[j][y] = temp;
		}
	}

}
