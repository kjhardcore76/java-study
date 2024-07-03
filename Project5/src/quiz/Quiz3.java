package quiz;

public class Quiz3 {

	public static int compare(int a, int b) {
		if(a == 1) {System.exit(0);}
		return a > b ? a : b ;
	}

	public static void main(String[] args) {
		System.out.println(compare(1,3));
	}

}
