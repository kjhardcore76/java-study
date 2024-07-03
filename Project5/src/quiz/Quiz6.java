package quiz;

public class Quiz6 {
	int a = 10;
	
	public static int sumDigits (int num) {
		/*
		int remain = num;
		int num1 = remain / 100;
		remain = remain % 100;
		int num2 = remain / 10;
		remain = remain % 10;
		int num3 = remain;
		int result = num1 + num2 + num3;
		System.out.println(result);
		return result;
		*/
		
		int remain = num;
		int sum = 0;
		for(int i=2; i>=0; i--) {
			int divideNum = 1;
			for(int j=1; j<=i; j++) {
				divideNum *= 10;
			}
			sum += remain / ((int) divideNum);
			remain = remain % ((int) divideNum);
		}
		return sum;
		
		/*
		for(int i=2; i>=0; i--) {
			sum += remain / ((int) Math.pow(10,i));
			remain = remain % ((int) Math.pow(10,i));
		}
		return sum;
		*/
		
	}
	public static void main(String[] args) {
		System.out.println(sumDigits(234));
	}
}
