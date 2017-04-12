package by.htp.taskPage51;

public class Test {
	public static void main(String[] args) {
	
		//int size = 5;
		//int[][] mas = new int[size][size];
		
		int[][] mas = { { 1, 4, 5, 3, 4 },
		  				  { 2, 3, 4, 8, 9 },
		  				  { 10, 4, 8, 3, 1 },
		  				  { 8, 4, 3, 9, -4 },
		  				  { 6, 5, 5, 6, 1 } };
		 
		
		C3 c3 = new C3();
		c3.search(mas);
		
		/*C12 c= new C12();
		c.minElement(mas);
		System.out.println("min" + c.getMin() + " x" +c.getX() + " y"+c.getY());
		c.zamena(mas, 0, 0);*/
		
	}
}
