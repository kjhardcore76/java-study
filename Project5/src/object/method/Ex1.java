package object.method;

public class Ex1 {
	public static void method1() {
		System.out.println("매개변수와 리턴타입이 없는 함수");
	}

	public static int method2(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		method1();
		int sum = method2(1, 2);
		System.out.println(sum);
	}

}
