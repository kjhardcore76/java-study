package object.method;

public class Ex2 {
	public static int add (int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static void main(String[] args) {
		int sum1 = add(1,2);
		int sum2 = add(3,4);
		System.out.println(sum1 > sum2);
	}

}
