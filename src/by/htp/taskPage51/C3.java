package by.htp.taskPage51;

public class C3 {
	private int up = 0;
	private int maxUp = 0;
	private int upX = 0;
	private int upY = 0;
	private int maxUpX = 0;
	private int maxUpY = 0;

	public void search(int[][] mas) {
		if (mas != null) {
			for (int j = 0; j < mas.length; j++) {
				for (int i = 0; i < mas[j].length; i++) {

					if (i != mas[j].length - 1) {
						if (mas[j][i] > mas[j][i + 1]) {
							position(j, i);
						} else {
							initMax();
						}
						
						if (mas[j][i] < mas[j][i + 1]) {
							position(j, i);
						} else {
							initMax();
						}
					} else {
						
						if(mas[j][i] < mas[j+1][0]) {
							position(j, i);
						} else {
							initMax();
						}
						if(mas[j][i] > mas[j+1][0]) {
							position(j, i);
						} else {
							initMax();
						}
					}
				}
			}
			System.out.println("{}" + maxUp + "x" + maxUpX + "y" + maxUpY);
		}
	}

	private void position(int j, int i) {
		if (up == 0) {
			upX = j;
			upY = i;
		}
		up++;
	}

	private void initMax() {
		if (up > maxUp) {
			maxUp = up;
			maxUpX = upX;
			maxUpY = upY;
		}
		up = 0;
	}
}
