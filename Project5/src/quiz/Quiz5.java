package quiz;

public class Quiz5 {
	int a = 10;
	
	public static String remain(int a, int b) {
		System.out.println(a);
		return b != 0 ? Integer.toString(a%b) : "수식오류";
	}

	public static void main(String[] args) {
		//System.out.println(remain(3, 1));
		Test test1 = new Test();
		test1.setN(5);
		Test test2 = new Test();
		test2.setN(3);
	}
}

class Test {
	int n;
	void setN(int n) {
		this.n = n;
		System.out.println(this.n);
	}
}