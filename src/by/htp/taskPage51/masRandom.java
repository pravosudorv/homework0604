package by.htp.taskPage51;

import java.util.Random;

public class masRandom {
	Random random = new Random();

	public void randomInt(int[][] mas) {
		for (int j = 0; j < mas.length; j++) {
			for (int i = 0; i < mas[j].length; i++) {
				mas[j][i] = random.nextInt(mas.length);
			}
		}
	}
	
	public void randomInt(int[] mas) {
			for (int i = 0; i < mas.length; i++) {
				mas[i] = random.nextInt(mas.length);
			}
		}
	
}
