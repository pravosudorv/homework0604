package by.htp.taskPage51;

public class A8 {
	
	public static void searchPolindrom(int[] mas) {
		for(int i : mas) {
			String temp = String.valueOf(i);
			if(isPalindrome(temp)) {
				System.out.println(i);
			}
		}
	}
	
	private static boolean isPalindrome(String temp) { /**proveryaem yavlyaetsya li chislo polindromom*/
		boolean result = true;
		for(int i = 0; i < temp.length()/2; i++) {
			if(temp.charAt(i) != temp.charAt(temp.length() - i - 1)) {
				result = false;
				break;
			}
		}
		return result;
	}

}
