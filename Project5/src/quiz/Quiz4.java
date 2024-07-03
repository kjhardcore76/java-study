package quiz;

public class Quiz4 {

	public static int subtraction(int a, int b) {
		/*
		 * if(a < b) { return -999; } return a - b ;
		 */
		return a > b ? a - b : -999;
	}

	public static void main(String[] args) {
		System.out.println(subtraction(3, 1));
	}

}
