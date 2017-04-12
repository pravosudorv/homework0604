package by.htp.taskPage51;

public class C3 {
	private int up = 0;
	private int down = 0;
	private int max = 0;
	private int upX = 0;
	private int upY = 0;
	private int downX = 0;
	private int downY = 0;
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

						if (mas[j][i] > mas[j][i + 1]) {
							positionDown(j, i);
						} else {
							initMaxDown();
						}
					} else {
						if (j != mas.length - 1) {
							if (mas[j][i] < mas[j + 1][0]) {
								positionUp(j, i);
							} else {
								initMaxUp();
							}
							if (mas[j][i] > mas[j + 1][0]) {
								positionDown(j, i);
							} else {
								initMaxDown();
							}
						}
					}
				}
			}
			System.out.println("{}" + max + "x" + maxX + "y" + maxY);
		}
	}

	private void positionUp(int j, int i) {
		if (up == 0) {
			upX = j;
			upY = i;
		}
		up++;
	}

	private void positionDown(int j, int i) {
		if (down == 0) {
			downX = j;
			downY = i;
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

	private void initMaxDown() {
		if (down > max) {
			max = down;
			maxX = downX;
			maxY = downY;
		}
		down = 0;
	}
}
