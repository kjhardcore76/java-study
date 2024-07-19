package ex;

public class Ex3Kjh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

interface CalcKjh{
	int add(int a, int b);
	int substract(int a, int b);
	int times(int a, int b);
	int divide(int a, int b);
}

class NewCalcKjh implements CalcKjh{
	public int add (int a, int b) {
		return a + b;
	}
	public int substract (int a, int b) {
		return a - b;
	}
	public int times (int a, int b) {
		return a + b;
	}
	public int divide (int a, int b) {
		return (b != 0 )?  a / b: Calc.ERROR;
	}
}