package by.htp.taskPage51;

public class C3 {
	private int up = 0;
	
	private int max = 0;
	private int upX = 0;
	private int upY = 0;
	private int maxX = 0;
	private int maxY = 0;

	public void search(int[][] mas) {
		if (mas != null) {
			for (int j = 0; j < mas.length; j++) {
				for (int i = 0; i < mas[j].length; i++) {

					if (i != mas[j].length - 1) {
						if (mas[j][i] < mas[j][i + 1]) {
							positionUp(j, i);
						} else {
							initMaxUp();
						}

					} else {
						if (j != mas.length - 1) {
							if (mas[j][i] < mas[j + 1][0]) {
								positionUp(j, i);
							} else {
								initMaxUp();
							}
						}
					}
				}
			}
		}
	}

	private void positionUp(int j, int i) {
		if (up == 0) {
			upX = j;
			upY = i;
		}
		up++;
	}

	private void initMaxUp() {
		if (up > max) {
			max = up;
			maxX = upX;
			maxY = upY;
		}
		up = 0;
	}

}
