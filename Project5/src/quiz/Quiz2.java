package quiz;

public class Quiz2 {

	public static int sumRange(int start, int end) {
		int sum = 0;
		for(int i = start ; i<= end ; i++) sum += i;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumRange(1,10));
	}

}
